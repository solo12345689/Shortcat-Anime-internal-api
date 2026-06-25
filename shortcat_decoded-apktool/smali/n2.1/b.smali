.class public final Ln2/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ln2/b;

.field private static final b:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ln2/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ln2/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln2/b;->a:Ln2/b;

    .line 7
    .line 8
    new-instance v0, Ln2/a;

    .line 9
    .line 10
    invoke-direct {v0}, Ln2/a;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v2, v0, v1, v2}, LY/H;->h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ln2/b;->b:LY/b1;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Landroidx/lifecycle/Y;
    .locals 1

    .line 1
    invoke-static {}, Ln2/b;->b()Landroidx/lifecycle/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final b()Landroidx/lifecycle/Y;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method


# virtual methods
.method public final c(LY/m;I)Landroidx/lifecycle/Y;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)"

    .line 9
    .line 10
    const v2, -0x22d19e38

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, Ln2/b;->b:LY/b1;

    .line 17
    .line 18
    invoke-interface {p1, p2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Landroidx/lifecycle/Y;

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    const p2, 0x4b1d16e9    # 1.0295017E7f

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-static {p1, p2}, Ln2/c;->a(LY/m;I)Landroidx/lifecycle/Y;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :goto_0
    invoke-interface {p1}, LY/m;->O()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const v0, 0x4b1d128d    # 1.0293901E7f

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_1
    invoke-static {}, LY/w;->L()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-static {}, LY/w;->T()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-object p2
.end method
