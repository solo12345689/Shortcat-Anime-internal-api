.class public final Lw/F0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/y0;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw/F0;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public d(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lw/F0;->f()I

    .line 2
    .line 3
    .line 4
    move-result p5

    .line 5
    int-to-long v0, p5

    .line 6
    const-wide/32 v2, 0xf4240

    .line 7
    .line 8
    .line 9
    mul-long/2addr v0, v2

    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-gez p1, :cond_0

    .line 13
    .line 14
    return-object p3

    .line 15
    :cond_0
    return-object p4
.end method

.method public e(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 0

    .line 1
    return-object p5
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lw/F0;->a:I

    .line 2
    .line 3
    return v0
.end method
