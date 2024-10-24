package net.minestom.server.command;

import net.minestom.server.network.NetworkBuffer;
import net.minestom.server.registry.StaticProtocolObject;
import net.minestom.server.utils.NamespaceID;
import net.minestom.server.utils.nbt.BinaryTagSerializer;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED by GenericEnumGenerator
 */
public enum ArgumentParserType implements StaticProtocolObject {
    BOOL(NamespaceID.from("brigadier:bool")),

    FLOAT(NamespaceID.from("brigadier:float")),

    DOUBLE(NamespaceID.from("brigadier:double")),

    INTEGER(NamespaceID.from("brigadier:integer")),

    LONG(NamespaceID.from("brigadier:long")),

    STRING(NamespaceID.from("brigadier:string")),

    ENTITY(NamespaceID.from("minecraft:entity")),

    GAME_PROFILE(NamespaceID.from("minecraft:game_profile")),

    BLOCK_POS(NamespaceID.from("minecraft:block_pos")),

    COLUMN_POS(NamespaceID.from("minecraft:column_pos")),

    VEC3(NamespaceID.from("minecraft:vec3")),

    VEC2(NamespaceID.from("minecraft:vec2")),

    BLOCK_STATE(NamespaceID.from("minecraft:block_state")),

    BLOCK_PREDICATE(NamespaceID.from("minecraft:block_predicate")),

    ITEM_STACK(NamespaceID.from("minecraft:item_stack")),

    ITEM_PREDICATE(NamespaceID.from("minecraft:item_predicate")),

    COLOR(NamespaceID.from("minecraft:color")),

    COMPONENT(NamespaceID.from("minecraft:component")),

    STYLE(NamespaceID.from("minecraft:style")),

    MESSAGE(NamespaceID.from("minecraft:message")),

    NBT_COMPOUND_TAG(NamespaceID.from("minecraft:nbt_compound_tag")),

    NBT_TAG(NamespaceID.from("minecraft:nbt_tag")),

    NBT_PATH(NamespaceID.from("minecraft:nbt_path")),

    OBJECTIVE(NamespaceID.from("minecraft:objective")),

    OBJECTIVE_CRITERIA(NamespaceID.from("minecraft:objective_criteria")),

    OPERATION(NamespaceID.from("minecraft:operation")),

    PARTICLE(NamespaceID.from("minecraft:particle")),

    ANGLE(NamespaceID.from("minecraft:angle")),

    ROTATION(NamespaceID.from("minecraft:rotation")),

    SCOREBOARD_SLOT(NamespaceID.from("minecraft:scoreboard_slot")),

    SCORE_HOLDER(NamespaceID.from("minecraft:score_holder")),

    SWIZZLE(NamespaceID.from("minecraft:swizzle")),

    TEAM(NamespaceID.from("minecraft:team")),

    ITEM_SLOT(NamespaceID.from("minecraft:item_slot")),

    ITEM_SLOTS(NamespaceID.from("minecraft:item_slots")),

    RESOURCE_LOCATION(NamespaceID.from("minecraft:resource_location")),

    FUNCTION(NamespaceID.from("minecraft:function")),

    ENTITY_ANCHOR(NamespaceID.from("minecraft:entity_anchor")),

    INT_RANGE(NamespaceID.from("minecraft:int_range")),

    FLOAT_RANGE(NamespaceID.from("minecraft:float_range")),

    DIMENSION(NamespaceID.from("minecraft:dimension")),

    GAMEMODE(NamespaceID.from("minecraft:gamemode")),

    TIME(NamespaceID.from("minecraft:time")),

    RESOURCE_OR_TAG(NamespaceID.from("minecraft:resource_or_tag")),

    RESOURCE_OR_TAG_KEY(NamespaceID.from("minecraft:resource_or_tag_key")),

    RESOURCE(NamespaceID.from("minecraft:resource")),

    RESOURCE_KEY(NamespaceID.from("minecraft:resource_key")),

    TEMPLATE_MIRROR(NamespaceID.from("minecraft:template_mirror")),

    TEMPLATE_ROTATION(NamespaceID.from("minecraft:template_rotation")),

    HEIGHTMAP(NamespaceID.from("minecraft:heightmap")),

    LOOT_TABLE(NamespaceID.from("minecraft:loot_table")),

    LOOT_PREDICATE(NamespaceID.from("minecraft:loot_predicate")),

    LOOT_MODIFIER(NamespaceID.from("minecraft:loot_modifier")),

    UUID(NamespaceID.from("minecraft:uuid"));

    public static final NetworkBuffer.Type<ArgumentParserType> NETWORK_TYPE = NetworkBuffer.Enum(ArgumentParserType.class);

    public static final BinaryTagSerializer<ArgumentParserType> NBT_TYPE = BinaryTagSerializer.fromEnumKeyed(ArgumentParserType.class);

    private final NamespaceID namespace;

    ArgumentParserType(@NotNull NamespaceID namespace) {
        this.namespace = namespace;
    }

    @NotNull
    @Override
    public NamespaceID namespace() {
        return this.namespace;
    }

    @Override
    public int id() {
        return this.ordinal();
    }
}
