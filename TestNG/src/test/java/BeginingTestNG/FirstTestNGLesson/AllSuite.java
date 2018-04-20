package BeginingTestNG.FirstTestNGLesson;

import java.util.Locale.Category;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Slow.class)
@ExcludeCategory(Fast.class)
@SuiteClasses({FinishJunit.class, FinishJunitPart2.class})
public class AllSuite {
      
}
