package Common;

import com.example.options.TempDemo;
import example.easy.EasyOuterClass;

import java.util.Arrays;

public class EasyMain {
    public static void main(String[] args) {

        TempDemo tempMessage = TempDemo.newBuilder().setId(99).build();
        System.out.println(tempMessage);

        EasyOuterClass.Easy message = EasyOuterClass.Easy.newBuilder()
                .setId(12)
                .setName("srinivasan")
                .setIsVerified(true)
                .addAllSampleList(Arrays.asList(10,21,22))
                .addSampleList(100)
                .addSampleList(200)
                .build();
        System.out.println(message);
    }
}