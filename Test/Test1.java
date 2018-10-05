
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
        grade.Set_Value("12");

        grade.convertGrade(grade);
        Assert.assertTrue( 12 == grade.GetValue_Danish());
    }
}