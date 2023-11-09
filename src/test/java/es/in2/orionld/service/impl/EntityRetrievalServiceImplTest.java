/*package es.in2.orionld.service.impl;

import es.in2.orionld.config.BrokerProperties;
import es.in2.orionld.utils.ApplicationUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntityRetrievalServiceImplTest {

    @Mock
    private ApplicationUtils applicationUtils;

    @Mock
    private BrokerProperties brokerProperties;

    @InjectMocks
    private EntityRetrievalServiceImpl entityRetrievalService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEntity() {
        String entityId = "urn:ngsi-ld:sample-entity";
        String expectedResponse = "Sample entity data";

        Mockito.when(brokerProperties.domain()).thenReturn("https://example.com");
        Mockito.when(brokerProperties.paths().entities()).thenReturn("/api/v1/entities");
        Mockito.when(applicationUtils.getRequest("https://example.com/api/v1/entities/urn:ngsi-ld:sample-entity"))
                .thenReturn(expectedResponse);

        String actualResponse = entityRetrievalService.getEntity(entityId);

        assertEquals(expectedResponse, actualResponse);
    }
}
*/