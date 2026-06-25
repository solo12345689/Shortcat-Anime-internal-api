.class public final Lze/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lze/c;


# instance fields
.field private final a:Lve/i;

.field private final b:LXe/c;

.field private final c:Ljava/util/Map;

.field private final d:Z

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lve/i;LXe/c;Ljava/util/Map;Z)V
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allValueArguments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lze/l;->a:Lve/i;

    .line 3
    iput-object p2, p0, Lze/l;->b:LXe/c;

    .line 4
    iput-object p3, p0, Lze/l;->c:Ljava/util/Map;

    .line 5
    iput-boolean p4, p0, Lze/l;->d:Z

    .line 6
    sget-object p1, LTd/q;->b:LTd/q;

    new-instance p2, Lze/k;

    invoke-direct {p2, p0}, Lze/k;-><init>(Lze/l;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lze/l;->e:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lve/i;LXe/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lze/l;-><init>(Lve/i;LXe/c;Ljava/util/Map;Z)V

    return-void
.end method

.method static synthetic b(Lze/l;)Lqf/d0;
    .locals 0

    .line 1
    invoke-static {p0}, Lze/l;->c(Lze/l;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lze/l;)Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lze/l;->a:Lve/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Lze/l;->f()LXe/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Lve/i;->p(LXe/c;)Lye/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lye/e;->p()Lqf/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lze/l;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LXe/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lze/l;->b:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lqf/S;
    .locals 2

    .line 1
    iget-object v0, p0, Lze/l;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getValue(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lqf/S;

    .line 13
    .line 14
    return-object v0
.end method

.method public k()Lye/h0;
    .locals 2

    .line 1
    sget-object v0, Lye/h0;->a:Lye/h0;

    .line 2
    .line 3
    const-string v1, "NO_SOURCE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
