.class public final LM2/A$b;
.super Lq2/Y;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final e:Lq2/C;


# direct methods
.method public constructor <init>(Lq2/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq2/Y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/A$b;->e:Lq2/C;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, LM2/A$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, -0x1

    .line 8
    return p1
.end method

.method public k(ILq2/Y$b;Z)Lq2/Y$b;
    .locals 11

    .line 1
    const/4 p1, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    :goto_0
    if-eqz p3, :cond_1

    .line 13
    .line 14
    sget-object p1, LM2/A$a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_1
    move-object v3, p1

    .line 17
    sget-object v9, Lq2/b;->g:Lq2/b;

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    move-object v1, p2

    .line 29
    invoke-virtual/range {v1 .. v10}, Lq2/Y$b;->u(Ljava/lang/Object;Ljava/lang/Object;IJJLq2/b;Z)Lq2/Y$b;

    .line 30
    .line 31
    .line 32
    return-object v1
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
    sget-object p1, LM2/A$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public s(ILq2/Y$d;J)Lq2/Y$d;
    .locals 21

    .line 1
    sget-object v1, Lq2/Y$d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    iget-object v2, v0, LM2/A$b;->e:Lq2/C;

    .line 6
    .line 7
    const/16 v18, 0x0

    .line 8
    .line 9
    const-wide/16 v19, 0x0

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x1

    .line 29
    const/4 v12, 0x0

    .line 30
    const-wide/16 v13, 0x0

    .line 31
    .line 32
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    move-object/from16 v0, p2

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v20}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lq2/Y$d;->k:Z

    .line 46
    .line 47
    return-object v0
.end method

.method public t()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
