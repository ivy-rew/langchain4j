package dev.langchain4j.model.bedrock.common;

import static dev.langchain4j.model.bedrock.TestedModels.MISTRAL_LARGE;
import static dev.langchain4j.model.bedrock.common.BedrockAiServicesIT.sleepIfNeeded;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.common.AbstractAiServiceWithToolsIT;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

@EnabledIfEnvironmentVariable(named = "AWS_SECRET_ACCESS_KEY", matches = ".+")
class BedrockAiServiceWithToolsIT extends AbstractAiServiceWithToolsIT {

    @Override
    protected List<ChatModel> models() {
        return List.of(MISTRAL_LARGE);
    }

    @AfterEach
    void afterEach() {
        sleepIfNeeded();
    }
}
