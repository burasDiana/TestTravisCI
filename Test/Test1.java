
import com.company.Grade;
import com.company.Main;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void Test() {
        Assert.assertTrue(true);
    }

    @Test
    public void GradeConversionTest(){
        Grade grade = new Grade();
        Assert.assertTrue( 12 == grade.convertGrade('a'));
    }


}