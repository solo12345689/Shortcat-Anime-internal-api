.class public Lcom/adjust/sdk/ObjectInputFilterStream;
.super Ljava/io/ObjectInputStream;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field static final ALLOWED_CLASSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v16, "com.adjust.sdk.AdjustAttribution"

    .line 4
    .line 5
    const-string v17, "com.adjust.sdk.EventMetadata"

    .line 6
    .line 7
    const-string v1, "java.lang.Boolean"

    .line 8
    .line 9
    const-string v2, "java.lang.Double"

    .line 10
    .line 11
    const-string v3, "java.lang.Enum"

    .line 12
    .line 13
    const-string v4, "java.lang.Float"

    .line 14
    .line 15
    const-string v5, "java.lang.Integer"

    .line 16
    .line 17
    const-string v6, "java.lang.Long"

    .line 18
    .line 19
    const-string v7, "java.lang.Number"

    .line 20
    .line 21
    const-string v8, "java.lang.String"

    .line 22
    .line 23
    const-string v9, "java.util.ArrayList"

    .line 24
    .line 25
    const-string v10, "java.util.HashMap"

    .line 26
    .line 27
    const-string v11, "java.util.LinkedHashMap"

    .line 28
    .line 29
    const-string v12, "java.util.LinkedList"

    .line 30
    .line 31
    const-string v13, "com.adjust.sdk.ActivityKind"

    .line 32
    .line 33
    const-string v14, "com.adjust.sdk.ActivityPackage"

    .line 34
    .line 35
    const-string v15, "com.adjust.sdk.ActivityState"

    .line 36
    .line 37
    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/adjust/sdk/ObjectInputFilterStream;->ALLOWED_CLASSES:Ljava/util/Set;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/ObjectStreamClass;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/adjust/sdk/ObjectInputFilterStream;->ALLOWED_CLASSES:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/io/ObjectStreamClass;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1}, Ljava/io/ObjectInputStream;->resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v0, Ljava/io/InvalidClassException;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/io/ObjectStreamClass;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "Blocked deserialization"

    .line 25
    .line 26
    invoke-direct {v0, v1, p1}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
