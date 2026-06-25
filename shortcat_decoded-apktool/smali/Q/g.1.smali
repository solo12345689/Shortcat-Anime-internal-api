.class public final LQ/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/window/s;


# instance fields
.field private final a:Ll0/e;

.field private final b:LQ/i;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ll0/e;LQ/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ/g;->a:Ll0/e;

    .line 5
    .line 6
    iput-object p2, p0, LQ/g;->b:LQ/i;

    .line 7
    .line 8
    sget-object p1, Lr0/f;->b:Lr0/f$a;

    .line 9
    .line 10
    invoke-virtual {p1}, Lr0/f$a;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, LQ/g;->c:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Li1/p;JLi1/t;J)J
    .locals 6

    .line 1
    iget-object p2, p0, LQ/g;->b:LQ/i;

    .line 2
    .line 3
    invoke-interface {p2}, LQ/i;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    invoke-static {p2, p3}, Lr0/g;->b(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-wide p2, p0, LQ/g;->c:J

    .line 15
    .line 16
    :goto_0
    iput-wide p2, p0, LQ/g;->c:J

    .line 17
    .line 18
    iget-object v0, p0, LQ/g;->a:Ll0/e;

    .line 19
    .line 20
    sget-object v1, Li1/r;->b:Li1/r$a;

    .line 21
    .line 22
    invoke-virtual {v1}, Li1/r$a;->a()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    move-object v5, p4

    .line 27
    move-wide v1, p5

    .line 28
    invoke-interface/range {v0 .. v5}, Ll0/e;->a(JJLi1/t;)J

    .line 29
    .line 30
    .line 31
    move-result-wide p4

    .line 32
    invoke-virtual {p1}, Li1/p;->i()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-static {p2, p3}, Li1/o;->d(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    invoke-static {v0, v1, p1, p2}, Li1/n;->o(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    invoke-static {p1, p2, p4, p5}, Li1/n;->o(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    return-wide p1
.end method
