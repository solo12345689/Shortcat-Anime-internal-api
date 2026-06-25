.class final LE3/N6$a;
.super Lq2/Y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/N6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final k:Ljava/lang/Object;


# instance fields
.field private final e:Lq2/C;

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:Lq2/C$g;

.field private final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE3/N6$a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LE3/N6;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lq2/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LE3/N6;->b()Lq2/C;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LE3/N6$a;->e:Lq2/C;

    .line 9
    .line 10
    invoke-virtual {p1}, LE3/N6;->r()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, LE3/N6$a;->f:Z

    .line 15
    .line 16
    invoke-virtual {p1}, LE3/N6;->l()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput-boolean v0, p0, LE3/N6$a;->g:Z

    .line 21
    .line 22
    invoke-virtual {p1}, LE3/N6;->h0()Lq2/Y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, LE3/N6;->h0()Lq2/Y;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1}, LE3/N6;->K0()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    new-instance v2, Lq2/Y$d;

    .line 41
    .line 42
    invoke-direct {v2}, Lq2/Y$d;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-boolean v0, v0, Lq2/Y$d;->k:Z

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_0
    iput-boolean v0, p0, LE3/N6$a;->h:Z

    .line 57
    .line 58
    invoke-virtual {p1}, LE3/N6;->Y0()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    sget-object v0, Lq2/C$g;->f:Lq2/C$g;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v0, 0x0

    .line 68
    :goto_1
    iput-object v0, p0, LE3/N6$a;->i:Lq2/C$g;

    .line 69
    .line 70
    invoke-virtual {p1}, LE3/N6;->t0()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    iput-wide v0, p0, LE3/N6$a;->j:J

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, LE3/N6$a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, -0x1

    .line 12
    return p1
.end method

.method public k(ILq2/Y$b;Z)Lq2/Y$b;
    .locals 8

    .line 1
    sget-object v1, LE3/N6$a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget-wide v4, p0, LE3/N6$a;->j:J

    .line 4
    .line 5
    const-wide/16 v6, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v2, v1

    .line 9
    move-object v0, p2

    .line 10
    invoke-virtual/range {v0 .. v7}, Lq2/Y$b;->t(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lq2/Y$b;

    .line 11
    .line 12
    .line 13
    iget-boolean p1, p0, LE3/N6$a;->h:Z

    .line 14
    .line 15
    iput-boolean p1, v0, Lq2/Y$b;->f:Z

    .line 16
    .line 17
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public q(I)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, LE3/N6$a;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public s(ILq2/Y$d;J)Lq2/Y$d;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v2, LE3/N6$a;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, v0, LE3/N6$a;->e:Lq2/C;

    .line 6
    .line 7
    iget-boolean v11, v0, LE3/N6$a;->f:Z

    .line 8
    .line 9
    iget-boolean v12, v0, LE3/N6$a;->g:Z

    .line 10
    .line 11
    iget-object v13, v0, LE3/N6$a;->i:Lq2/C$g;

    .line 12
    .line 13
    iget-wide v4, v0, LE3/N6$a;->j:J

    .line 14
    .line 15
    const/16 v19, 0x0

    .line 16
    .line 17
    const-wide/16 v20, 0x0

    .line 18
    .line 19
    move-wide/from16 v16, v4

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v14, 0x0

    .line 38
    .line 39
    const/16 v18, 0x0

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v21}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 44
    .line 45
    .line 46
    iget-boolean v2, v0, LE3/N6$a;->h:Z

    .line 47
    .line 48
    iput-boolean v2, v1, Lq2/Y$d;->k:Z

    .line 49
    .line 50
    return-object v1
.end method

.method public t()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
