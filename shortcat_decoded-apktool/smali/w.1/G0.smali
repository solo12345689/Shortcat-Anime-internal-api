.class public final Lw/G0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/z0;


# instance fields
.field private final a:F

.field private final b:F

.field private final synthetic c:Lw/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(FFLw/q;)V
    .locals 0

    .line 5
    invoke-static {p3, p1, p2}, Lw/w0;->a(Lw/q;FF)Lw/s;

    move-result-object p3

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lw/G0;-><init>(FFLw/s;)V

    return-void
.end method

.method private constructor <init>(FFLw/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lw/G0;->a:F

    .line 3
    iput p2, p0, Lw/G0;->b:F

    .line 4
    new-instance p1, Lw/A0;

    invoke-direct {p1, p3}, Lw/A0;-><init>(Lw/s;)V

    iput-object p1, p0, Lw/G0;->c:Lw/A0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/G0;->c:Lw/A0;

    .line 2
    .line 3
    invoke-interface {v0}, Lw/z0;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b(Lw/q;Lw/q;Lw/q;)J
    .locals 1

    .line 1
    iget-object v0, p0, Lw/G0;->c:Lw/A0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lw/A0;->b(Lw/q;Lw/q;Lw/q;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public d(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/G0;->c:Lw/A0;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    invoke-virtual/range {v0 .. v5}, Lw/A0;->d(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public e(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/G0;->c:Lw/A0;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-object v3, p3

    .line 5
    move-object v4, p4

    .line 6
    move-object v5, p5

    .line 7
    invoke-virtual/range {v0 .. v5}, Lw/A0;->e(JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public g(Lw/q;Lw/q;Lw/q;)Lw/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/G0;->c:Lw/A0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lw/A0;->g(Lw/q;Lw/q;Lw/q;)Lw/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
