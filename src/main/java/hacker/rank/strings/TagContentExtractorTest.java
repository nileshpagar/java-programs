package hacker.rank.strings;

import static org.junit.Assert.*;

import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * Created by Nilesh Pagar on 5/8/2017.
 */
public class TagContentExtractorTest {

    @Test
    public void parseXmlTag(){
        assertEquals(Lists.newArrayList("Nayeem loves counseling"), TagContentExtractor.parse("<h1>Nayeem loves counseling</h1>"));
        assertEquals(Lists.newArrayList("Sanjay has no watch", "So wait for a while"), TagContentExtractor.parse("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse("<Amee>safat codes like a ninja</amee>"));
        assertEquals(Lists.newArrayList("Imtiaz has a secret crush"), TagContentExtractor.parse("<SA premium>Imtiaz has a secret crush</SA premium>"));
        assertEquals(Lists.newArrayList("contents"), TagContentExtractor.parse("<h1><a>contents</a>invalid</h1>"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse(""));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse("<h1><h1></h1></h1>"));
        assertEquals(Lists.newArrayList("None"), TagContentExtractor.parse("<>hello</>"));
        assertEquals(Lists.newArrayList("dim"), TagContentExtractor.parse("<>hello</><h>dim</h>"));
        assertEquals(Lists.newArrayList("dim"), TagContentExtractor.parse("<>hello</><h>dim</h>>>>>"));
    }

}
