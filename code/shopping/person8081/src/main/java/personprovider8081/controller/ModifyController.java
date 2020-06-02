package personprovider8081.controller;


import common.pojo.Person;
import common.pojo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import personprovider8081.service.impl.ModifyServiceImpl;
import personprovider8081.utils.FileUploadUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.InetAddress;

/**
 * 这里的修改信息的地方,
 * 删除用户的 地方
 */
@Controller
@RequestMapping("/Person")
public class ModifyController {


    ModifyServiceImpl modifyService;

    @Autowired
    public void setModifyService(ModifyServiceImpl modifyService) {
        this.modifyService = modifyService;
    }

    /**
     * @param person  即将需要修改的对象
     * @return 返回修改结果
     */
    @RequestMapping("/Modify")
    @ResponseBody
    public ResultData<String> modify(Person person, @RequestParam(value = "file",required = false)MultipartFile file, HttpServletRequest request) throws FileNotFoundException {

        ResultData<String> data = new ResultData<>();
        System.out.println("modify\n" + person);
        if (person == null || person.getUser_id() <= 0) {
            data.setCode(-1);
            data.setMessage("修改失败");
            data.setData("信息不完整");
        }else {

            if(file==null||file.isEmpty()){
                System.out.println("图片为空");
                person.setUser_banner_img(null);
            }else{
                String file_name= FileUploadUtils.generateRandonFileName(file.getOriginalFilename());
                System.out.println();
                String filePath=System.getProperty("user.dir")+"\\src\\main\\resources\\upload\\"+file_name;
//                System.out.println(filePath);
//                System.out.println(request.getServletContext().getContextPath());
//                System.out.println(request.getServletContext().getRealPath("/"));
//                System.out.println(request.getSession().getServletContext().getRealPath("/"));
//                System.out.println(getIpAddress(request));
//                System.out.println(getResourceBasePath());
                File f = new File(filePath);

                // 不存在文件夹
                if(!f.getParentFile().exists()){
                    System.out.println("文件夹不存在");
                    f.getParentFile().mkdirs();
                }

                try {
                    file.transferTo(f);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                person.setUser_banner_img(filePath);
            }
            return modifyService.ModifyPerson(person);
        }
        return data;
    }

    /**
     * 添加用户信息,格式必须为json 格式的，所以前端必须 contentType : "application/json",
     * @param person  需要添加用户的信息
     * @return 返回添加用户的id
     */
    @RequestMapping("/Add")
    @ResponseBody
    public ResultData<Integer> add(@RequestBody Person person) {
        ResultData<Integer> data = new ResultData<>();
        System.out.println("add\n" + person);

        try {
            if (check(person)) {
                data.setCode(-1);
                data.setMessage("修改失败");
                data.setData(-1);
            } else {
                person.setUser_money(0.0);
                return modifyService.AddPerson(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    /**
     * 检查用户信息是否完整
     *
     * @param person
     * @return
     */
    public Boolean check(Person person) {

        if (person == null) {
            return true;
        }
        if (person.getUser_name() == null || person.getUser_name() == "") {
            return true;
        }

        if (!(person.getUser_gender() == 1 || person.getUser_gender() == 0)) {
            return true;
        }
        if (!(person.getUser_lev() == 1 || person.getUser_lev() == 2)) {
            return true;
        }
        return false;
    }


    //获取客户端IP地址
    private String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length () == 0 || "unknown".equalsIgnoreCase (ip)) {
            ip = request.getHeader ("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length () == 0 || "unknown".equalsIgnoreCase (ip)) {
            ip = request.getRemoteAddr ();
            if (ip.equals ("127.0.0.1")) {
                //根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost ();
                } catch (Exception e) {
                    e.printStackTrace ();
                }
                ip = inet.getHostAddress ();
            }
        }
        // 多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ip != null && ip.length () > 15) {
            if (ip.indexOf (",") > 0) {
                ip = ip.substring (0, ip.indexOf (","));
            }
        }
        return ip;
    }

    /**
     * 获取项目根路径
     *
     * @return
     */
    private static String getResourceBasePath() {
        // 获取跟目录
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            // nothing to do
        }
        if (path == null || !path.exists()) {
            path = new File("");
        }

        String pathStr = path.getAbsolutePath();
        // 如果是在eclipse中运行，则和target同级目录,如果是jar部署到服务器，则默认和jar包同级
        pathStr = pathStr.replace("\\target\\classes", "");

        return pathStr;
    }

}
