.class public final LP3/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP3/h$a;-><init>()V

    return-void
.end method

.method public static synthetic a(LP3/i;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, LP3/h$a;->c(LP3/i;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LP3/i;)LTd/L;
    .locals 2

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/r;->getLifecycle()Landroidx/lifecycle/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LP3/b;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LP3/b;-><init>(LP3/i;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->addObserver(Landroidx/lifecycle/q;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, LTd/L;->a:LTd/L;

    .line 14
    .line 15
    return-object p0
.end method


# virtual methods
.method public final b(LP3/i;)LP3/h;
    .locals 2

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LR3/b;

    .line 7
    .line 8
    new-instance v1, LP3/g;

    .line 9
    .line 10
    invoke-direct {v1, p1}, LP3/g;-><init>(LP3/i;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, LR3/b;-><init>(LP3/i;Lie/a;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, LP3/h;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {p1, v0, v1}, LP3/h;-><init>(LR3/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method
