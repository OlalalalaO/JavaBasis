import com.Demo03.Myservice;
import com.Demo03.impl.C;
import com.Demo03.impl.I;

module myOne {
    exports com.Demo01;  //导出包
    exports com.Demo03;

    provides Myservice with C;  //配置了实现类
}