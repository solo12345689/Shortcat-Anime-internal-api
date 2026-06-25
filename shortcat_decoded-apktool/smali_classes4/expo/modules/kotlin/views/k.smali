.class public final Lexpo/modules/kotlin/views/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/ReadableMap;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReadableMap;

.field private final b:Ljava/util/List;

.field private final c:LUb/m;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "backingMap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filteredKeys"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/views/k;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance p2, LUb/m;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->getEntryIterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Lexpo/modules/kotlin/views/j;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/views/j;-><init>(Lexpo/modules/kotlin/views/k;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, LUb/m;-><init>(Ljava/util/Iterator;LUb/l;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lexpo/modules/kotlin/views/k;->c:LUb/m;

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic a(Lexpo/modules/kotlin/views/k;Ljava/util/Map$Entry;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/views/k;->c(Lexpo/modules/kotlin/views/k;Ljava/util/Map$Entry;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lexpo/modules/kotlin/views/k;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/kotlin/views/k;->e(Lexpo/modules/kotlin/views/k;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final c(Lexpo/modules/kotlin/views/k;Ljava/util/Map$Entry;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lexpo/modules/kotlin/views/k;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    xor-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    return p0
.end method

.method private static final e(Lexpo/modules/kotlin/views/k;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lexpo/modules/kotlin/views/k;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    xor-int/lit8 p0, p0, 0x1

    .line 13
    .line 14
    return p0
.end method


# virtual methods
.method public d()LUb/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->c:LUb/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public getDouble(Ljava/lang/String;)D
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public bridge synthetic getEntryIterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/views/k;->d()LUb/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getLong(Ljava/lang/String;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public hasKey(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public isNull(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/kotlin/views/l;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lexpo/modules/kotlin/views/i;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lexpo/modules/kotlin/views/i;-><init>(Lexpo/modules/kotlin/views/k;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lexpo/modules/kotlin/views/l;-><init>(Lcom/facebook/react/bridge/ReadableMapKeySetIterator;LUb/l;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public toHashMap()Ljava/util/HashMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/views/k;->a:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
