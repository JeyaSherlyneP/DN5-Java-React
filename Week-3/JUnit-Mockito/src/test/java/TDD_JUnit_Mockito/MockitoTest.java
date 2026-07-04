package TDD_JUnit_Mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    void testMockingAndStubbing() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        assertEquals("Mock Data", api.getData());
    }

    @Test
    void testVerifyMethodCalled() {

        ExternalApi api = mock(ExternalApi.class);

        api.getData();

        verify(api).getData();
    }
}