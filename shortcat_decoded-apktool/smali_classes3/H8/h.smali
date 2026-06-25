.class final LH8/h;
.super LP8/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LP8/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;LR8/d;Ljava/lang/Object;LQ8/d;LQ8/l;)LP8/a$f;
    .locals 7

    .line 1
    invoke-static {p4}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/auth/d;

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v5, p5

    .line 11
    move-object v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth/d;-><init>(Landroid/content/Context;Landroid/os/Looper;LR8/d;LH8/c;LQ8/d;LQ8/l;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
