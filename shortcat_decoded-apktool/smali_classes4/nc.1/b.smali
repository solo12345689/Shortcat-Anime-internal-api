.class public final Lnc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnc/b;->a:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lnc/b;Ljava/lang/Class;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnc/b;->c(Lnc/b;Ljava/lang/Class;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lnc/b;Ljava/lang/Class;)LTd/L;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnc/b;->d(Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object p0
.end method

.method private final d(Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnc/b;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;Lexpo/modules/kotlin/jni/JavaScriptObject;)V
    .locals 1

    .line 1
    const-string v0, "native"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "js"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lnc/a;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lnc/a;-><init>(Lnc/b;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, Lexpo/modules/kotlin/jni/JavaScriptObject;->c(Lie/a;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lnc/b;->a:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(Ljava/lang/Class;)Lexpo/modules/kotlin/jni/JavaScriptObject;
    .locals 1

    .line 1
    const-string v0, "native"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnc/b;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 13
    .line 14
    return-object p1
.end method
