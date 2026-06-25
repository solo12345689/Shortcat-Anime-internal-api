.class public final Lw/H0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/y0;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lw/D;

.field private final d:Lw/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(IILw/D;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lw/H0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lw/H0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lw/H0;->c:Lw/D;

    .line 9
    .line 10
    new-instance p1, Lw/A0;

    .line 11
    .line 12
    new-instance p2, Lw/K;

    .line 13
    .line 14
    invoke-virtual {p0}, Lw/H0;->c()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Lw/H0;->f()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {p2, v0, v1, p3}, Lw/K;-><init>(IILw/D;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Lw/A0;-><init>(Lw/H;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lw/H0;->d:Lw/A0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lw/H0;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public d(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 6

    .line 1
    iget-object v0, p0, Lw/H0;->d:Lw/A0;

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
    iget-object v0, p0, Lw/H0;->d:Lw/A0;

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

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lw/H0;->b:I

    .line 2
    .line 3
    return v0
.end method
