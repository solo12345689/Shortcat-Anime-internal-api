.class public final Lv/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv/e;


# instance fields
.field private a:Lw/o0;

.field private final b:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lw/o0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv/f;->a:Lw/o0;

    .line 5
    .line 6
    sget-object p1, Li1/r;->b:Li1/r$a;

    .line 7
    .line 8
    invoke-virtual {p1}, Li1/r$a;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {v0, v1}, Li1/r;->b(J)Li1/r;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {p1, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lv/f;->b:LY/C0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, Lv/f;->b:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method
