package io.yggdrash.node;

import io.yggdrash.core.Block;

import java.util.LinkedHashMap;

public interface BlockChain {
    Block addBlock(Block generatedBlock);

    Block getBlockByIndex(int index);

    Block getBlockByHash(String id);

    LinkedHashMap<byte[], Block> getBlocks();
}
