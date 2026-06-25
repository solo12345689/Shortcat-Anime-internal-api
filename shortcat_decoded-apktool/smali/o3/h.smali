.class public Lo3/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/h$b;,
        Lo3/h$a;
    }
.end annotation


# static fields
.field public static final P:LU2/u;

.field private static final Q:[B

.field private static final R:Lq2/x;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:Lo3/h$b;

.field private E:I

.field private F:I

.field private G:I

.field private H:Z

.field private I:Z

.field private J:LU2/r;

.field private K:[LU2/O;

.field private L:[LU2/O;

.field private M:Z

.field private N:Z

.field private O:J

.field private final a:Lr3/r$a;

.field private final b:I

.field private final c:Lo3/t;

.field private final d:Ljava/util/List;

.field private final e:Landroid/util/SparseArray;

.field private final f:Lt2/I;

.field private final g:Lt2/I;

.field private final h:Lt2/I;

.field private final i:[B

.field private final j:Lt2/I;

.field private final k:Lt2/O;

.field private final l:Lf3/c;

.field private final m:Lt2/I;

.field private final n:Ljava/util/ArrayDeque;

.field private final o:Ljava/util/ArrayDeque;

.field private final p:Lu2/k;

.field private final q:LU2/O;

.field private final r:LU2/h;

.field private s:LP9/u;

.field private t:I

.field private u:I

.field private v:J

.field private w:I

.field private x:Lt2/I;

.field private y:J

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo3/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lo3/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo3/h;->P:LU2/u;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Lo3/h;->Q:[B

    .line 16
    .line 17
    new-instance v0, Lq2/x$b;

    .line 18
    .line 19
    invoke-direct {v0}, Lq2/x$b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "application/x-emsg"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lo3/h;->R:Lq2/x;

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Lr3/r$a;I)V
    .locals 7

    .line 1
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Lo3/h;-><init>(Lr3/r$a;ILt2/O;Lo3/t;Ljava/util/List;LU2/O;)V

    return-void
.end method

.method public constructor <init>(Lr3/r$a;ILt2/O;Lo3/t;Ljava/util/List;LU2/O;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lo3/h;->a:Lr3/r$a;

    .line 5
    iput p2, p0, Lo3/h;->b:I

    .line 6
    iput-object p3, p0, Lo3/h;->k:Lt2/O;

    .line 7
    iput-object p4, p0, Lo3/h;->c:Lo3/t;

    .line 8
    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lo3/h;->d:Ljava/util/List;

    .line 9
    iput-object p6, p0, Lo3/h;->q:LU2/O;

    .line 10
    new-instance p1, Lf3/c;

    invoke-direct {p1}, Lf3/c;-><init>()V

    iput-object p1, p0, Lo3/h;->l:Lf3/c;

    .line 11
    new-instance p1, Lt2/I;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lt2/I;-><init>(I)V

    iput-object p1, p0, Lo3/h;->m:Lt2/I;

    .line 12
    new-instance p1, Lt2/I;

    sget-object p3, Lu2/h;->a:[B

    invoke-direct {p1, p3}, Lt2/I;-><init>([B)V

    iput-object p1, p0, Lo3/h;->f:Lt2/I;

    .line 13
    new-instance p1, Lt2/I;

    const/4 p3, 0x6

    invoke-direct {p1, p3}, Lt2/I;-><init>(I)V

    iput-object p1, p0, Lo3/h;->g:Lt2/I;

    .line 14
    new-instance p1, Lt2/I;

    invoke-direct {p1}, Lt2/I;-><init>()V

    iput-object p1, p0, Lo3/h;->h:Lt2/I;

    .line 15
    new-array p1, p2, [B

    iput-object p1, p0, Lo3/h;->i:[B

    .line 16
    new-instance p2, Lt2/I;

    invoke-direct {p2, p1}, Lt2/I;-><init>([B)V

    iput-object p2, p0, Lo3/h;->j:Lt2/I;

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 18
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 20
    invoke-static {}, LP9/u;->A()LP9/u;

    move-result-object p1

    iput-object p1, p0, Lo3/h;->s:LP9/u;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    iput-wide p1, p0, Lo3/h;->B:J

    .line 22
    iput-wide p1, p0, Lo3/h;->A:J

    .line 23
    iput-wide p1, p0, Lo3/h;->C:J

    .line 24
    sget-object p1, LU2/r;->P:LU2/r;

    iput-object p1, p0, Lo3/h;->J:LU2/r;

    const/4 p1, 0x0

    .line 25
    new-array p2, p1, [LU2/O;

    iput-object p2, p0, Lo3/h;->K:[LU2/O;

    .line 26
    new-array p1, p1, [LU2/O;

    iput-object p1, p0, Lo3/h;->L:[LU2/O;

    .line 27
    new-instance p1, Lu2/k;

    new-instance p2, Lo3/g;

    invoke-direct {p2, p0}, Lo3/g;-><init>(Lo3/h;)V

    invoke-direct {p1, p2}, Lu2/k;-><init>(Lu2/k$b;)V

    iput-object p1, p0, Lo3/h;->p:Lu2/k;

    .line 28
    new-instance p1, LU2/h;

    invoke-direct {p1}, LU2/h;-><init>()V

    iput-object p1, p0, Lo3/h;->r:LU2/h;

    const-wide/16 p1, -0x1

    .line 29
    iput-wide p1, p0, Lo3/h;->O:J

    return-void
.end method

.method private A(J)V
    .locals 11

    .line 1
    :cond_0
    iget-object v0, p0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lo3/h$a;

    .line 16
    .line 17
    iget v1, p0, Lo3/h;->z:I

    .line 18
    .line 19
    iget v2, v0, Lo3/h$a;->c:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, p0, Lo3/h;->z:I

    .line 23
    .line 24
    iget-wide v1, v0, Lo3/h$a;->a:J

    .line 25
    .line 26
    iget-boolean v3, v0, Lo3/h$a;->b:Z

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    add-long/2addr v1, p1

    .line 31
    :cond_1
    iget-object v3, p0, Lo3/h;->k:Lt2/O;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, Lt2/O;->a(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    :cond_2
    move-wide v4, v1

    .line 40
    iget-object v1, p0, Lo3/h;->K:[LU2/O;

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x0

    .line 44
    move v10, v3

    .line 45
    :goto_0
    if-ge v10, v2, :cond_0

    .line 46
    .line 47
    aget-object v3, v1, v10

    .line 48
    .line 49
    iget v7, v0, Lo3/h$a;->c:I

    .line 50
    .line 51
    iget v8, p0, Lo3/h;->z:I

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-interface/range {v3 .. v9}, LU2/O;->a(JIIILU2/O$a;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v10, v10, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return-void
.end method

.method private static B(Lt2/I;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lo3/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    return-wide v0
.end method

.method private static C(Lu2/e$b;Landroid/util/SparseArray;ZI[B)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu2/e$b;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lu2/e$b;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lu2/e$b;

    .line 17
    .line 18
    iget v3, v2, Lu2/e;->a:I

    .line 19
    .line 20
    const v4, 0x74726166

    .line 21
    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    invoke-static {v2, p1, p2, p3, p4}, Lo3/h;->L(Lu2/e$b;Landroid/util/SparseArray;ZI[B)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method private static D(Lt2/I;Lo3/v;)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lo3/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    and-int/2addr v2, v3

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lt2/I;->Q()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Lo3/b;->q(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v1, p1, Lo3/v;->d:J

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_0
    add-long/2addr v1, v3

    .line 45
    iput-wide v1, p1, Lo3/v;->d:J

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string p1, "Unexpected saio entry count: "

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {p0, p1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    throw p0
.end method

.method private static E(Lo3/u;Lt2/I;Lo3/v;)V
    .locals 7

    .line 1
    iget p0, p0, Lo3/u;->d:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lt2/I;->b0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lt2/I;->v()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lo3/b;->p(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    and-int/2addr v1, v2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lt2/I;->c0(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lt2/I;->M()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lt2/I;->Q()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v3, p2, Lo3/v;->f:I

    .line 32
    .line 33
    if-gt v1, v3, :cond_6

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p2, Lo3/v;->m:[Z

    .line 39
    .line 40
    move v4, v3

    .line 41
    move v5, v4

    .line 42
    :goto_0
    if-ge v4, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lt2/I;->M()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v5, v6

    .line 49
    if-le v6, p0, :cond_1

    .line 50
    .line 51
    move v6, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v6, v3

    .line 54
    :goto_1
    aput-boolean v6, v0, v4

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    if-le v0, p0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v2, v3

    .line 63
    :goto_2
    mul-int v5, v0, v1

    .line 64
    .line 65
    iget-object p0, p2, Lo3/v;->m:[Z

    .line 66
    .line 67
    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object p0, p2, Lo3/v;->m:[Z

    .line 71
    .line 72
    iget p1, p2, Lo3/v;->f:I

    .line 73
    .line 74
    invoke-static {p0, v1, p1, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 75
    .line 76
    .line 77
    if-lez v5, :cond_5

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Lo3/v;->d(I)V

    .line 80
    .line 81
    .line 82
    :cond_5
    return-void

    .line 83
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string p1, "Saiz sample count "

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " is greater than fragment sample count"

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget p1, p2, Lo3/v;->f:I

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 p1, 0x0

    .line 111
    invoke-static {p0, p1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0
.end method

.method private static F(Lu2/e$b;Ljava/lang/String;Lo3/v;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v5, v2

    .line 8
    move-object v6, v5

    .line 9
    move v4, v3

    .line 10
    :goto_0
    iget-object v7, v0, Lu2/e$b;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    if-ge v4, v7, :cond_2

    .line 17
    .line 18
    iget-object v7, v0, Lu2/e$b;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, Lu2/e$c;

    .line 25
    .line 26
    iget-object v8, v7, Lu2/e$c;->b:Lt2/I;

    .line 27
    .line 28
    iget v7, v7, Lu2/e;->a:I

    .line 29
    .line 30
    const v9, 0x73626770

    .line 31
    .line 32
    .line 33
    const v10, 0x73656967

    .line 34
    .line 35
    .line 36
    const/16 v11, 0xc

    .line 37
    .line 38
    if-ne v7, v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v8, v11}, Lt2/I;->b0(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Lt2/I;->v()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ne v7, v10, :cond_1

    .line 48
    .line 49
    move-object v5, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const v9, 0x73677064

    .line 52
    .line 53
    .line 54
    if-ne v7, v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Lt2/I;->b0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Lt2/I;->v()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-ne v7, v10, :cond_1

    .line 64
    .line 65
    move-object v6, v8

    .line 66
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-eqz v5, :cond_d

    .line 70
    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_3
    const/16 v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v5, v0}, Lt2/I;->b0(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lt2/I;->v()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, Lo3/b;->q(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x4

    .line 89
    invoke-virtual {v5, v7}, Lt2/I;->c0(I)V

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    if-ne v4, v8, :cond_4

    .line 94
    .line 95
    invoke-virtual {v5, v7}, Lt2/I;->c0(I)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {v5}, Lt2/I;->v()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v8, :cond_c

    .line 103
    .line 104
    invoke-virtual {v6, v0}, Lt2/I;->b0(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lt2/I;->v()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Lo3/b;->q(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v6, v7}, Lt2/I;->c0(I)V

    .line 116
    .line 117
    .line 118
    if-ne v0, v8, :cond_6

    .line 119
    .line 120
    invoke-virtual {v6}, Lt2/I;->O()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const-wide/16 v9, 0x0

    .line 125
    .line 126
    cmp-long v0, v4, v9

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const-string v0, "Variable length description in sgpd found (unsupported)"

    .line 132
    .line 133
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    throw v0

    .line 138
    :cond_6
    const/4 v4, 0x2

    .line 139
    if-lt v0, v4, :cond_7

    .line 140
    .line 141
    invoke-virtual {v6, v7}, Lt2/I;->c0(I)V

    .line 142
    .line 143
    .line 144
    :cond_7
    :goto_2
    invoke-virtual {v6}, Lt2/I;->O()J

    .line 145
    .line 146
    .line 147
    move-result-wide v4

    .line 148
    const-wide/16 v9, 0x1

    .line 149
    .line 150
    cmp-long v0, v4, v9

    .line 151
    .line 152
    if-nez v0, :cond_b

    .line 153
    .line 154
    invoke-virtual {v6, v8}, Lt2/I;->c0(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lt2/I;->M()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    and-int/lit16 v4, v0, 0xf0

    .line 162
    .line 163
    shr-int/lit8 v14, v4, 0x4

    .line 164
    .line 165
    and-int/lit8 v15, v0, 0xf

    .line 166
    .line 167
    invoke-virtual {v6}, Lt2/I;->M()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-ne v0, v8, :cond_8

    .line 172
    .line 173
    move v10, v8

    .line 174
    goto :goto_3

    .line 175
    :cond_8
    move v10, v3

    .line 176
    :goto_3
    if-nez v10, :cond_9

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    invoke-virtual {v6}, Lt2/I;->M()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    const/16 v0, 0x10

    .line 184
    .line 185
    new-array v13, v0, [B

    .line 186
    .line 187
    invoke-virtual {v6, v13, v3, v0}, Lt2/I;->q([BII)V

    .line 188
    .line 189
    .line 190
    if-nez v12, :cond_a

    .line 191
    .line 192
    invoke-virtual {v6}, Lt2/I;->M()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    new-array v2, v0, [B

    .line 197
    .line 198
    invoke-virtual {v6, v2, v3, v0}, Lt2/I;->q([BII)V

    .line 199
    .line 200
    .line 201
    :cond_a
    move-object/from16 v16, v2

    .line 202
    .line 203
    iput-boolean v8, v1, Lo3/v;->l:Z

    .line 204
    .line 205
    new-instance v9, Lo3/u;

    .line 206
    .line 207
    move-object/from16 v11, p1

    .line 208
    .line 209
    invoke-direct/range {v9 .. v16}, Lo3/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 210
    .line 211
    .line 212
    iput-object v9, v1, Lo3/v;->n:Lo3/u;

    .line 213
    .line 214
    return-void

    .line 215
    :cond_b
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 216
    .line 217
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    throw v0

    .line 222
    :cond_c
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 223
    .line 224
    invoke-static {v0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    throw v0

    .line 229
    :cond_d
    :goto_4
    return-void
.end method

.method private static G(Lt2/I;ILo3/v;)V
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Lo3/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    and-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    and-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, v0

    .line 26
    :goto_0
    invoke-virtual {p0}, Lt2/I;->Q()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object p0, p2, Lo3/v;->m:[Z

    .line 33
    .line 34
    iget p1, p2, Lo3/v;->f:I

    .line 35
    .line 36
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget v2, p2, Lo3/v;->f:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p2, Lo3/v;->m:[Z

    .line 45
    .line 46
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lt2/I;->a()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2, p1}, Lo3/v;->d(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, Lo3/v;->b(Lt2/I;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string p1, "Senc sample count "

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, " is different from fragment sample count"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget p1, p2, Lo3/v;->f:I

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 p1, 0x0

    .line 88
    invoke-static {p0, p1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 94
    .line 95
    invoke-static {p0}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    throw p0
.end method

.method private static H(Lt2/I;Lo3/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lo3/h;->G(Lt2/I;ILo3/v;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private static I(Lt2/I;J)Landroid/util/Pair;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt2/I;->b0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lo3/b;->q(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lt2/I;->c0(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, p1, v5

    .line 35
    .line 36
    move-wide v9, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lt2/I;->T()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, Lt2/I;->T()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    const-wide/32 v5, 0xf4240

    .line 48
    .line 49
    .line 50
    invoke-static/range {v3 .. v8}, Lt2/a0;->m1(JJJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v11

    .line 54
    const/4 v1, 0x2

    .line 55
    invoke-virtual {v0, v1}, Lt2/I;->c0(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    new-array v13, v1, [I

    .line 63
    .line 64
    new-array v14, v1, [J

    .line 65
    .line 66
    new-array v15, v1, [J

    .line 67
    .line 68
    new-array v5, v1, [J

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-wide/from16 v16, v9

    .line 72
    .line 73
    move-wide/from16 v18, v11

    .line 74
    .line 75
    move v9, v6

    .line 76
    :goto_2
    if-ge v9, v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    const/high16 v10, -0x80000000

    .line 83
    .line 84
    and-int/2addr v10, v6

    .line 85
    if-nez v10, :cond_1

    .line 86
    .line 87
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 88
    .line 89
    .line 90
    move-result-wide v20

    .line 91
    const v10, 0x7fffffff

    .line 92
    .line 93
    .line 94
    and-int/2addr v6, v10

    .line 95
    aput v6, v13, v9

    .line 96
    .line 97
    aput-wide v16, v14, v9

    .line 98
    .line 99
    aput-wide v18, v5, v9

    .line 100
    .line 101
    add-long v3, v3, v20

    .line 102
    .line 103
    move-object v10, v5

    .line 104
    const-wide/32 v5, 0xf4240

    .line 105
    .line 106
    .line 107
    invoke-static/range {v3 .. v8}, Lt2/a0;->m1(JJJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v18

    .line 111
    aget-wide v5, v10, v9

    .line 112
    .line 113
    sub-long v5, v18, v5

    .line 114
    .line 115
    aput-wide v5, v15, v9

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lt2/I;->c0(I)V

    .line 118
    .line 119
    .line 120
    aget v5, v13, v9

    .line 121
    .line 122
    int-to-long v5, v5

    .line 123
    add-long v16, v16, v5

    .line 124
    .line 125
    add-int/lit8 v9, v9, 0x1

    .line 126
    .line 127
    move-object v5, v10

    .line 128
    goto :goto_2

    .line 129
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-static {v0, v1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    throw v0

    .line 137
    :cond_2
    move-object v10, v5

    .line 138
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v1, LU2/g;

    .line 143
    .line 144
    invoke-direct {v1, v13, v14, v15, v10}, LU2/g;-><init>([I[J[J[J)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0
.end method

.method private static J(Lt2/I;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lo3/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
.end method

.method private static K(Lt2/I;Landroid/util/SparseArray;Z)Lo3/h$b;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lo3/b;->p(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    check-cast p1, Lo3/h$b;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    and-int/lit8 p2, v0, 0x1

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object p2, p1, Lo3/h$b;->b:Lo3/v;

    .line 46
    .line 47
    iput-wide v1, p2, Lo3/v;->c:J

    .line 48
    .line 49
    iput-wide v1, p2, Lo3/v;->d:J

    .line 50
    .line 51
    :cond_2
    iget-object p2, p1, Lo3/h$b;->e:Lo3/c;

    .line 52
    .line 53
    and-int/lit8 v1, v0, 0x2

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/lit8 v1, v1, -0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    iget v1, p2, Lo3/c;->a:I

    .line 65
    .line 66
    :goto_2
    and-int/lit8 v2, v0, 0x8

    .line 67
    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    iget v2, p2, Lo3/c;->b:I

    .line 76
    .line 77
    :goto_3
    and-int/lit8 v3, v0, 0x10

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    goto :goto_4

    .line 86
    :cond_5
    iget v3, p2, Lo3/c;->c:I

    .line 87
    .line 88
    :goto_4
    and-int/lit8 v0, v0, 0x20

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    goto :goto_5

    .line 97
    :cond_6
    iget p0, p2, Lo3/c;->d:I

    .line 98
    .line 99
    :goto_5
    iget-object p2, p1, Lo3/h$b;->b:Lo3/v;

    .line 100
    .line 101
    new-instance v0, Lo3/c;

    .line 102
    .line 103
    invoke-direct {v0, v1, v2, v3, p0}, Lo3/c;-><init>(IIII)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p2, Lo3/v;->a:Lo3/c;

    .line 107
    .line 108
    return-object p1
.end method

.method private static L(Lu2/e$b;Landroid/util/SparseArray;ZI[B)V
    .locals 6

    .line 1
    const v0, 0x74666864

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lu2/e$c;

    .line 13
    .line 14
    iget-object v0, v0, Lu2/e$c;->b:Lt2/I;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lo3/h;->K(Lt2/I;Landroid/util/SparseArray;Z)Lo3/h$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_0
    iget-object p2, p1, Lo3/h$b;->b:Lo3/v;

    .line 25
    .line 26
    iget-wide v0, p2, Lo3/v;->q:J

    .line 27
    .line 28
    iget-boolean v2, p2, Lo3/v;->r:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lo3/h$b;->k()V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-static {p1, v3}, Lo3/h$b;->b(Lo3/h$b;Z)Z

    .line 35
    .line 36
    .line 37
    const v4, 0x74666474

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    and-int/lit8 v5, p3, 0x2

    .line 47
    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    iget-object v0, v4, Lu2/e$c;->b:Lt2/I;

    .line 51
    .line 52
    invoke-static {v0}, Lo3/h;->J(Lt2/I;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iput-wide v0, p2, Lo3/v;->q:J

    .line 57
    .line 58
    iput-boolean v3, p2, Lo3/v;->r:Z

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iput-wide v0, p2, Lo3/v;->q:J

    .line 62
    .line 63
    iput-boolean v2, p2, Lo3/v;->r:Z

    .line 64
    .line 65
    :goto_0
    invoke-static {p0, p1, p3}, Lo3/h;->O(Lu2/e$b;Lo3/h$b;I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, Lo3/h$b;->d:Lo3/w;

    .line 69
    .line 70
    iget-object p1, p1, Lo3/w;->a:Lo3/t;

    .line 71
    .line 72
    iget-object p3, p2, Lo3/v;->a:Lo3/c;

    .line 73
    .line 74
    invoke-static {p3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    check-cast p3, Lo3/c;

    .line 79
    .line 80
    iget p3, p3, Lo3/c;->a:I

    .line 81
    .line 82
    invoke-virtual {p1, p3}, Lo3/t;->b(I)Lo3/u;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const p3, 0x7361697a

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-eqz p3, :cond_2

    .line 94
    .line 95
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lo3/u;

    .line 100
    .line 101
    iget-object p3, p3, Lu2/e$c;->b:Lt2/I;

    .line 102
    .line 103
    invoke-static {v0, p3, p2}, Lo3/h;->E(Lo3/u;Lt2/I;Lo3/v;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    const p3, 0x7361696f

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-eqz p3, :cond_3

    .line 114
    .line 115
    iget-object p3, p3, Lu2/e$c;->b:Lt2/I;

    .line 116
    .line 117
    invoke-static {p3, p2}, Lo3/h;->D(Lt2/I;Lo3/v;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    const p3, 0x73656e63

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-eqz p3, :cond_4

    .line 128
    .line 129
    iget-object p3, p3, Lu2/e$c;->b:Lt2/I;

    .line 130
    .line 131
    invoke-static {p3, p2}, Lo3/h;->H(Lt2/I;Lo3/v;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    if-eqz p1, :cond_5

    .line 135
    .line 136
    iget-object p1, p1, Lo3/u;->b:Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_5
    const/4 p1, 0x0

    .line 140
    :goto_1
    invoke-static {p0, p1, p2}, Lo3/h;->F(Lu2/e$b;Ljava/lang/String;Lo3/v;)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lu2/e$b;->c:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    const/4 p3, 0x0

    .line 150
    :goto_2
    if-ge p3, p1, :cond_7

    .line 151
    .line 152
    iget-object v0, p0, Lu2/e$b;->c:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lu2/e$c;

    .line 159
    .line 160
    iget v1, v0, Lu2/e;->a:I

    .line 161
    .line 162
    const v2, 0x75756964

    .line 163
    .line 164
    .line 165
    if-ne v1, v2, :cond_6

    .line 166
    .line 167
    iget-object v0, v0, Lu2/e$c;->b:Lt2/I;

    .line 168
    .line 169
    invoke-static {v0, p2, p4}, Lo3/h;->P(Lt2/I;Lo3/v;[B)V

    .line 170
    .line 171
    .line 172
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_7
    :goto_3
    return-void
.end method

.method private static M(Lt2/I;)Landroid/util/Pair;
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, Lo3/c;

    .line 33
    .line 34
    invoke-direct {v4, v1, v2, v3, p0}, Lo3/c;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method private static N(Lo3/h$b;IILt2/I;I)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lt2/I;->b0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lt2/I;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Lo3/b;->p(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, v0, Lo3/h$b;->d:Lo3/w;

    .line 19
    .line 20
    iget-object v3, v3, Lo3/w;->a:Lo3/t;

    .line 21
    .line 22
    iget-object v4, v0, Lo3/h$b;->b:Lo3/v;

    .line 23
    .line 24
    iget-object v5, v4, Lo3/v;->a:Lo3/c;

    .line 25
    .line 26
    invoke-static {v5}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lo3/c;

    .line 31
    .line 32
    iget-object v6, v4, Lo3/v;->h:[I

    .line 33
    .line 34
    invoke-virtual {v2}, Lt2/I;->Q()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    aput v7, v6, p1

    .line 39
    .line 40
    iget-object v6, v4, Lo3/v;->g:[J

    .line 41
    .line 42
    iget-wide v7, v4, Lo3/v;->c:J

    .line 43
    .line 44
    aput-wide v7, v6, p1

    .line 45
    .line 46
    and-int/lit8 v9, v1, 0x1

    .line 47
    .line 48
    if-eqz v9, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2}, Lt2/I;->v()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    int-to-long v9, v9

    .line 55
    add-long/2addr v7, v9

    .line 56
    aput-wide v7, v6, p1

    .line 57
    .line 58
    :cond_0
    and-int/lit8 v6, v1, 0x4

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v6, v7

    .line 66
    :goto_0
    iget v9, v5, Lo3/c;->d:I

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    invoke-virtual {v2}, Lt2/I;->v()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    :cond_2
    and-int/lit16 v10, v1, 0x100

    .line 75
    .line 76
    if-eqz v10, :cond_3

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move v10, v7

    .line 81
    :goto_1
    and-int/lit16 v11, v1, 0x200

    .line 82
    .line 83
    if-eqz v11, :cond_4

    .line 84
    .line 85
    const/4 v11, 0x1

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v11, v7

    .line 88
    :goto_2
    and-int/lit16 v12, v1, 0x400

    .line 89
    .line 90
    if-eqz v12, :cond_5

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move v12, v7

    .line 95
    :goto_3
    and-int/lit16 v1, v1, 0x800

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move v1, v7

    .line 102
    :goto_4
    invoke-static {v3}, Lo3/h;->s(Lo3/t;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_7

    .line 107
    .line 108
    iget-object v13, v3, Lo3/t;->j:[J

    .line 109
    .line 110
    invoke-static {v13}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    check-cast v13, [J

    .line 115
    .line 116
    aget-wide v14, v13, v7

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    const-wide/16 v14, 0x0

    .line 120
    .line 121
    :goto_5
    iget-object v13, v4, Lo3/v;->i:[I

    .line 122
    .line 123
    iget-object v7, v4, Lo3/v;->j:[J

    .line 124
    .line 125
    const/16 v16, 0x1

    .line 126
    .line 127
    iget-object v8, v4, Lo3/v;->k:[Z

    .line 128
    .line 129
    move/from16 v17, v1

    .line 130
    .line 131
    iget v1, v3, Lo3/t;->b:I

    .line 132
    .line 133
    const/4 v2, 0x2

    .line 134
    if-ne v1, v2, :cond_8

    .line 135
    .line 136
    and-int/lit8 v1, p2, 0x1

    .line 137
    .line 138
    if-eqz v1, :cond_8

    .line 139
    .line 140
    move/from16 v1, v16

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_8
    const/4 v1, 0x0

    .line 144
    :goto_6
    iget-object v2, v4, Lo3/v;->h:[I

    .line 145
    .line 146
    aget v2, v2, p1

    .line 147
    .line 148
    add-int v2, p4, v2

    .line 149
    .line 150
    move/from16 v24, v6

    .line 151
    .line 152
    move-object/from16 v25, v7

    .line 153
    .line 154
    iget-wide v6, v3, Lo3/t;->c:J

    .line 155
    .line 156
    move-wide/from16 v22, v6

    .line 157
    .line 158
    iget-wide v6, v4, Lo3/v;->q:J

    .line 159
    .line 160
    move/from16 v3, p4

    .line 161
    .line 162
    :goto_7
    if-ge v3, v2, :cond_11

    .line 163
    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    invoke-virtual/range {p3 .. p3}, Lt2/I;->v()I

    .line 167
    .line 168
    .line 169
    move-result v18

    .line 170
    move/from16 p2, v1

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_9
    move/from16 p2, v1

    .line 174
    .line 175
    iget v1, v5, Lo3/c;->b:I

    .line 176
    .line 177
    move/from16 v18, v1

    .line 178
    .line 179
    :goto_8
    invoke-static/range {v18 .. v18}, Lo3/h;->j(I)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v11, :cond_a

    .line 184
    .line 185
    invoke-virtual/range {p3 .. p3}, Lt2/I;->v()I

    .line 186
    .line 187
    .line 188
    move-result v18

    .line 189
    move/from16 p1, v2

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_a
    move/from16 p1, v2

    .line 193
    .line 194
    iget v2, v5, Lo3/c;->c:I

    .line 195
    .line 196
    move/from16 v18, v2

    .line 197
    .line 198
    :goto_9
    invoke-static/range {v18 .. v18}, Lo3/h;->j(I)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v12, :cond_b

    .line 203
    .line 204
    invoke-virtual/range {p3 .. p3}, Lt2/I;->v()I

    .line 205
    .line 206
    .line 207
    move-result v18

    .line 208
    move/from16 p4, v2

    .line 209
    .line 210
    move/from16 v2, v18

    .line 211
    .line 212
    goto :goto_a

    .line 213
    :cond_b
    if-nez v3, :cond_c

    .line 214
    .line 215
    if-eqz v24, :cond_c

    .line 216
    .line 217
    move/from16 p4, v2

    .line 218
    .line 219
    move v2, v9

    .line 220
    goto :goto_a

    .line 221
    :cond_c
    move/from16 p4, v2

    .line 222
    .line 223
    iget v2, v5, Lo3/c;->d:I

    .line 224
    .line 225
    :goto_a
    if-eqz v17, :cond_d

    .line 226
    .line 227
    invoke-virtual/range {p3 .. p3}, Lt2/I;->v()I

    .line 228
    .line 229
    .line 230
    move-result v18

    .line 231
    move/from16 v26, v2

    .line 232
    .line 233
    move/from16 v2, v18

    .line 234
    .line 235
    :goto_b
    move/from16 v27, v3

    .line 236
    .line 237
    goto :goto_c

    .line 238
    :cond_d
    move/from16 v26, v2

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    goto :goto_b

    .line 242
    :goto_c
    int-to-long v2, v2

    .line 243
    add-long/2addr v2, v6

    .line 244
    sub-long v18, v2, v14

    .line 245
    .line 246
    const-wide/32 v20, 0xf4240

    .line 247
    .line 248
    .line 249
    invoke-static/range {v18 .. v23}, Lt2/a0;->m1(JJJ)J

    .line 250
    .line 251
    .line 252
    move-result-wide v2

    .line 253
    aput-wide v2, v25, v27

    .line 254
    .line 255
    move-wide/from16 v18, v2

    .line 256
    .line 257
    iget-boolean v2, v4, Lo3/v;->r:Z

    .line 258
    .line 259
    if-nez v2, :cond_e

    .line 260
    .line 261
    iget-object v2, v0, Lo3/h$b;->d:Lo3/w;

    .line 262
    .line 263
    iget-wide v2, v2, Lo3/w;->h:J

    .line 264
    .line 265
    add-long v2, v18, v2

    .line 266
    .line 267
    aput-wide v2, v25, v27

    .line 268
    .line 269
    :cond_e
    aput p4, v13, v27

    .line 270
    .line 271
    shr-int/lit8 v2, v26, 0x10

    .line 272
    .line 273
    and-int/lit8 v2, v2, 0x1

    .line 274
    .line 275
    if-nez v2, :cond_10

    .line 276
    .line 277
    if-eqz p2, :cond_f

    .line 278
    .line 279
    if-nez v27, :cond_10

    .line 280
    .line 281
    :cond_f
    move/from16 v2, v16

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_10
    const/4 v2, 0x0

    .line 285
    :goto_d
    aput-boolean v2, v8, v27

    .line 286
    .line 287
    int-to-long v1, v1

    .line 288
    add-long/2addr v6, v1

    .line 289
    add-int/lit8 v3, v27, 0x1

    .line 290
    .line 291
    move/from16 v2, p1

    .line 292
    .line 293
    move/from16 v1, p2

    .line 294
    .line 295
    goto/16 :goto_7

    .line 296
    .line 297
    :cond_11
    move/from16 p1, v2

    .line 298
    .line 299
    iput-wide v6, v4, Lo3/v;->q:J

    .line 300
    .line 301
    return p1
.end method

.method private static O(Lu2/e$b;Lo3/h$b;I)V
    .locals 8

    .line 1
    iget-object p0, p0, Lu2/e$b;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const v5, 0x7472756e

    .line 12
    .line 13
    .line 14
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Lu2/e$c;

    .line 21
    .line 22
    iget v7, v6, Lu2/e;->a:I

    .line 23
    .line 24
    if-ne v7, v5, :cond_0

    .line 25
    .line 26
    iget-object v5, v6, Lu2/e$c;->b:Lt2/I;

    .line 27
    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lt2/I;->b0(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Lt2/I;->Q()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    add-int/2addr v4, v5

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput v1, p1, Lo3/h$b;->h:I

    .line 46
    .line 47
    iput v1, p1, Lo3/h$b;->g:I

    .line 48
    .line 49
    iput v1, p1, Lo3/h$b;->f:I

    .line 50
    .line 51
    iget-object v2, p1, Lo3/h$b;->b:Lo3/v;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, Lo3/v;->e(II)V

    .line 54
    .line 55
    .line 56
    move v2, v1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v1, v0, :cond_3

    .line 59
    .line 60
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lu2/e$c;

    .line 65
    .line 66
    iget v6, v4, Lu2/e;->a:I

    .line 67
    .line 68
    if-ne v6, v5, :cond_2

    .line 69
    .line 70
    add-int/lit8 v6, v2, 0x1

    .line 71
    .line 72
    iget-object v4, v4, Lu2/e$c;->b:Lt2/I;

    .line 73
    .line 74
    invoke-static {p1, v2, p2, v4, v3}, Lo3/h;->N(Lo3/h$b;IILt2/I;I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v3, v2

    .line 79
    move v2, v6

    .line 80
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    return-void
.end method

.method private static P(Lt2/I;Lo3/v;[B)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p0, p2, v0, v1}, Lt2/I;->q([BII)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lo3/h;->Q:[B

    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p0, v1, p1}, Lo3/h;->G(Lt2/I;ILo3/v;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private Q(J)V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lu2/e$b;

    .line 16
    .line 17
    iget-wide v0, v0, Lu2/e$b;->b:J

    .line 18
    .line 19
    cmp-long v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lu2/e$b;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lo3/h;->v(Lu2/e$b;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0}, Lo3/h;->m()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private R(LU2/q;)Z
    .locals 11

    .line 1
    iget v0, p0, Lo3/h;->w:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0, v2, v1, v3}, LU2/q;->h([BIIZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return v2

    .line 22
    :cond_0
    iput v1, p0, Lo3/h;->w:I

    .line 23
    .line 24
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lt2/I;->b0(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 30
    .line 31
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    iput-wide v4, p0, Lo3/h;->v:J

    .line 36
    .line 37
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 38
    .line 39
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lo3/h;->u:I

    .line 44
    .line 45
    :cond_1
    iget-wide v4, p0, Lo3/h;->v:J

    .line 46
    .line 47
    const-wide/16 v6, 0x1

    .line 48
    .line 49
    cmp-long v0, v4, v6

    .line 50
    .line 51
    const-wide/16 v6, -0x1

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 56
    .line 57
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v0, v1, v1}, LU2/q;->readFully([BII)V

    .line 62
    .line 63
    .line 64
    iget v0, p0, Lo3/h;->w:I

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    iput v0, p0, Lo3/h;->w:I

    .line 68
    .line 69
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 70
    .line 71
    invoke-virtual {v0}, Lt2/I;->T()J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    iput-wide v4, p0, Lo3/h;->v:J

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-wide/16 v8, 0x0

    .line 79
    .line 80
    cmp-long v0, v4, v8

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    invoke-interface {p1}, LU2/q;->getLength()J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    cmp-long v0, v4, v6

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lu2/e$b;

    .line 107
    .line 108
    iget-wide v4, v0, Lu2/e$b;->b:J

    .line 109
    .line 110
    :cond_3
    cmp-long v0, v4, v6

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    sub-long/2addr v4, v8

    .line 119
    iget v0, p0, Lo3/h;->w:I

    .line 120
    .line 121
    int-to-long v8, v0

    .line 122
    add-long/2addr v4, v8

    .line 123
    iput-wide v4, p0, Lo3/h;->v:J

    .line 124
    .line 125
    :cond_4
    :goto_0
    iget-wide v4, p0, Lo3/h;->v:J

    .line 126
    .line 127
    iget v0, p0, Lo3/h;->w:I

    .line 128
    .line 129
    int-to-long v8, v0

    .line 130
    cmp-long v8, v4, v8

    .line 131
    .line 132
    if-ltz v8, :cond_12

    .line 133
    .line 134
    iget-wide v8, p0, Lo3/h;->O:J

    .line 135
    .line 136
    cmp-long v6, v8, v6

    .line 137
    .line 138
    if-eqz v6, :cond_6

    .line 139
    .line 140
    iget v6, p0, Lo3/h;->u:I

    .line 141
    .line 142
    const v7, 0x73696478

    .line 143
    .line 144
    .line 145
    if-ne v6, v7, :cond_5

    .line 146
    .line 147
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 148
    .line 149
    long-to-int v4, v4

    .line 150
    invoke-virtual {v0, v4}, Lt2/I;->X(I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 154
    .line 155
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v4, p0, Lo3/h;->j:Lt2/I;

    .line 160
    .line 161
    invoke-virtual {v4}, Lt2/I;->f()[B

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 169
    .line 170
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-wide v4, p0, Lo3/h;->v:J

    .line 175
    .line 176
    iget v2, p0, Lo3/h;->w:I

    .line 177
    .line 178
    int-to-long v8, v2

    .line 179
    sub-long/2addr v4, v8

    .line 180
    long-to-int v2, v4

    .line 181
    invoke-interface {p1, v0, v1, v2}, LU2/q;->readFully([BII)V

    .line 182
    .line 183
    .line 184
    new-instance v0, Lu2/e$c;

    .line 185
    .line 186
    iget-object v1, p0, Lo3/h;->j:Lt2/I;

    .line 187
    .line 188
    invoke-direct {v0, v7, v1}, Lu2/e$c;-><init>(ILt2/I;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v0, Lu2/e$c;->b:Lt2/I;

    .line 192
    .line 193
    invoke-interface {p1}, LU2/q;->j()J

    .line 194
    .line 195
    .line 196
    move-result-wide v1

    .line 197
    invoke-static {v0, v1, v2}, Lo3/h;->I(Lt2/I;J)Landroid/util/Pair;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iget-object v0, p0, Lo3/h;->r:LU2/h;

    .line 202
    .line 203
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, LU2/g;

    .line 206
    .line 207
    invoke-virtual {v0, p1}, LU2/h;->a(LU2/g;)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    int-to-long v0, v0

    .line 212
    sub-long/2addr v4, v0

    .line 213
    long-to-int v0, v4

    .line 214
    invoke-interface {p1, v0, v3}, LU2/q;->d(IZ)Z

    .line 215
    .line 216
    .line 217
    :goto_1
    invoke-direct {p0}, Lo3/h;->m()V

    .line 218
    .line 219
    .line 220
    return v3

    .line 221
    :cond_6
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    iget v0, p0, Lo3/h;->w:I

    .line 226
    .line 227
    int-to-long v6, v0

    .line 228
    sub-long/2addr v4, v6

    .line 229
    iget v0, p0, Lo3/h;->u:I

    .line 230
    .line 231
    const v6, 0x6d646174

    .line 232
    .line 233
    .line 234
    const v7, 0x6d6f6f66

    .line 235
    .line 236
    .line 237
    if-eq v0, v7, :cond_7

    .line 238
    .line 239
    if-ne v0, v6, :cond_8

    .line 240
    .line 241
    :cond_7
    iget-boolean v0, p0, Lo3/h;->M:Z

    .line 242
    .line 243
    if-nez v0, :cond_8

    .line 244
    .line 245
    iget-object v0, p0, Lo3/h;->J:LU2/r;

    .line 246
    .line 247
    new-instance v8, LU2/J$b;

    .line 248
    .line 249
    iget-wide v9, p0, Lo3/h;->B:J

    .line 250
    .line 251
    invoke-direct {v8, v9, v10, v4, v5}, LU2/J$b;-><init>(JJ)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v8}, LU2/r;->t(LU2/J;)V

    .line 255
    .line 256
    .line 257
    iput-boolean v3, p0, Lo3/h;->M:Z

    .line 258
    .line 259
    :cond_8
    iget v0, p0, Lo3/h;->u:I

    .line 260
    .line 261
    if-ne v0, v7, :cond_9

    .line 262
    .line 263
    iget-object v0, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    move v7, v2

    .line 270
    :goto_2
    if-ge v7, v0, :cond_9

    .line 271
    .line 272
    iget-object v8, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 273
    .line 274
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    check-cast v8, Lo3/h$b;

    .line 279
    .line 280
    iget-object v8, v8, Lo3/h$b;->b:Lo3/v;

    .line 281
    .line 282
    iput-wide v4, v8, Lo3/v;->b:J

    .line 283
    .line 284
    iput-wide v4, v8, Lo3/v;->d:J

    .line 285
    .line 286
    iput-wide v4, v8, Lo3/v;->c:J

    .line 287
    .line 288
    add-int/lit8 v7, v7, 0x1

    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_9
    iget v0, p0, Lo3/h;->u:I

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    if-ne v0, v6, :cond_a

    .line 295
    .line 296
    iput-object v7, p0, Lo3/h;->D:Lo3/h$b;

    .line 297
    .line 298
    iget-wide v0, p0, Lo3/h;->v:J

    .line 299
    .line 300
    add-long/2addr v4, v0

    .line 301
    iput-wide v4, p0, Lo3/h;->y:J

    .line 302
    .line 303
    const/4 p1, 0x2

    .line 304
    iput p1, p0, Lo3/h;->t:I

    .line 305
    .line 306
    return v3

    .line 307
    :cond_a
    invoke-static {v0}, Lo3/h;->V(I)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_d

    .line 312
    .line 313
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 314
    .line 315
    .line 316
    move-result-wide v0

    .line 317
    iget-wide v4, p0, Lo3/h;->v:J

    .line 318
    .line 319
    add-long/2addr v0, v4

    .line 320
    const-wide/16 v6, 0x8

    .line 321
    .line 322
    sub-long/2addr v0, v6

    .line 323
    iget v2, p0, Lo3/h;->w:I

    .line 324
    .line 325
    int-to-long v6, v2

    .line 326
    cmp-long v2, v4, v6

    .line 327
    .line 328
    if-eqz v2, :cond_b

    .line 329
    .line 330
    iget v2, p0, Lo3/h;->u:I

    .line 331
    .line 332
    const v4, 0x6d657461

    .line 333
    .line 334
    .line 335
    if-ne v2, v4, :cond_b

    .line 336
    .line 337
    invoke-direct {p0, p1}, Lo3/h;->t(LU2/q;)V

    .line 338
    .line 339
    .line 340
    :cond_b
    iget-object p1, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 341
    .line 342
    new-instance v2, Lu2/e$b;

    .line 343
    .line 344
    iget v4, p0, Lo3/h;->u:I

    .line 345
    .line 346
    invoke-direct {v2, v4, v0, v1}, Lu2/e$b;-><init>(IJ)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iget-wide v4, p0, Lo3/h;->v:J

    .line 353
    .line 354
    iget p1, p0, Lo3/h;->w:I

    .line 355
    .line 356
    int-to-long v6, p1

    .line 357
    cmp-long p1, v4, v6

    .line 358
    .line 359
    if-nez p1, :cond_c

    .line 360
    .line 361
    invoke-direct {p0, v0, v1}, Lo3/h;->Q(J)V

    .line 362
    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_c
    invoke-direct {p0}, Lo3/h;->m()V

    .line 366
    .line 367
    .line 368
    goto :goto_3

    .line 369
    :cond_d
    iget p1, p0, Lo3/h;->u:I

    .line 370
    .line 371
    invoke-static {p1}, Lo3/h;->W(I)Z

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    const-wide/32 v4, 0x7fffffff

    .line 376
    .line 377
    .line 378
    if-eqz p1, :cond_10

    .line 379
    .line 380
    iget p1, p0, Lo3/h;->w:I

    .line 381
    .line 382
    if-ne p1, v1, :cond_f

    .line 383
    .line 384
    iget-wide v6, p0, Lo3/h;->v:J

    .line 385
    .line 386
    cmp-long p1, v6, v4

    .line 387
    .line 388
    if-gtz p1, :cond_e

    .line 389
    .line 390
    new-instance p1, Lt2/I;

    .line 391
    .line 392
    iget-wide v4, p0, Lo3/h;->v:J

    .line 393
    .line 394
    long-to-int v0, v4

    .line 395
    invoke-direct {p1, v0}, Lt2/I;-><init>(I)V

    .line 396
    .line 397
    .line 398
    iget-object v0, p0, Lo3/h;->m:Lt2/I;

    .line 399
    .line 400
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {p1}, Lt2/I;->f()[B

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 409
    .line 410
    .line 411
    iput-object p1, p0, Lo3/h;->x:Lt2/I;

    .line 412
    .line 413
    iput v3, p0, Lo3/h;->t:I

    .line 414
    .line 415
    goto :goto_3

    .line 416
    :cond_e
    const-string p1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 417
    .line 418
    invoke-static {p1}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    throw p1

    .line 423
    :cond_f
    const-string p1, "Leaf atom defines extended atom size (unsupported)."

    .line 424
    .line 425
    invoke-static {p1}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    throw p1

    .line 430
    :cond_10
    iget-wide v0, p0, Lo3/h;->v:J

    .line 431
    .line 432
    cmp-long p1, v0, v4

    .line 433
    .line 434
    if-gtz p1, :cond_11

    .line 435
    .line 436
    iput-object v7, p0, Lo3/h;->x:Lt2/I;

    .line 437
    .line 438
    iput v3, p0, Lo3/h;->t:I

    .line 439
    .line 440
    :goto_3
    return v3

    .line 441
    :cond_11
    const-string p1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 442
    .line 443
    invoke-static {p1}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    throw p1

    .line 448
    :cond_12
    const-string p1, "Atom size less than header length (unsupported)."

    .line 449
    .line 450
    invoke-static {p1}, Lq2/L;->d(Ljava/lang/String;)Lq2/L;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    throw p1
.end method

.method private S(LU2/q;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lo3/h;->v:J

    .line 2
    .line 3
    iget v2, p0, Lo3/h;->w:I

    .line 4
    .line 5
    int-to-long v2, v2

    .line 6
    sub-long/2addr v0, v2

    .line 7
    long-to-int v0, v0

    .line 8
    iget-object v1, p0, Lo3/h;->x:Lt2/I;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lt2/I;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    invoke-interface {p1, v2, v3, v0}, LU2/q;->readFully([BII)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lu2/e$c;

    .line 22
    .line 23
    iget v2, p0, Lo3/h;->u:I

    .line 24
    .line 25
    invoke-direct {v0, v2, v1}, Lu2/e$c;-><init>(ILt2/I;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0, p1}, Lo3/h;->x(Lu2/e$c;LU2/q;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p1, v0}, LU2/q;->m(I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-direct {p0, v0, v1}, Lo3/h;->Q(J)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private T(LU2/q;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide v2, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v5, v1

    .line 15
    :goto_0
    if-ge v4, v0, :cond_1

    .line 16
    .line 17
    iget-object v6, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Lo3/h$b;

    .line 24
    .line 25
    iget-object v6, v6, Lo3/h$b;->b:Lo3/v;

    .line 26
    .line 27
    iget-boolean v7, v6, Lo3/v;->p:Z

    .line 28
    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    iget-wide v6, v6, Lo3/v;->d:J

    .line 32
    .line 33
    cmp-long v8, v6, v2

    .line 34
    .line 35
    if-gez v8, :cond_0

    .line 36
    .line 37
    iget-object v2, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    move-object v5, v2

    .line 44
    check-cast v5, Lo3/h$b;

    .line 45
    .line 46
    move-wide v2, v6

    .line 47
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    if-nez v5, :cond_2

    .line 51
    .line 52
    const/4 p1, 0x3

    .line 53
    iput p1, p0, Lo3/h;->t:I

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    invoke-interface {p1}, LU2/q;->getPosition()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    sub-long/2addr v2, v6

    .line 61
    long-to-int v0, v2

    .line 62
    if-ltz v0, :cond_3

    .line 63
    .line 64
    invoke-interface {p1, v0}, LU2/q;->m(I)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lo3/h$b;->b:Lo3/v;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lo3/v;->a(LU2/q;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    const-string p1, "Offset to encryption data was negative."

    .line 74
    .line 75
    invoke-static {p1, v1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    throw p1
.end method

.method private U(LU2/q;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lo3/h;->D:Lo3/h$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v2, :cond_3

    .line 10
    .line 11
    iget-object v2, v0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-static {v2}, Lo3/h;->p(Landroid/util/SparseArray;)Lo3/h$b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-wide v5, v0, Lo3/h;->y:J

    .line 20
    .line 21
    invoke-interface {v1}, LU2/q;->getPosition()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    sub-long/2addr v5, v7

    .line 26
    long-to-int v2, v5

    .line 27
    if-ltz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v2}, LU2/q;->m(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Lo3/h;->m()V

    .line 33
    .line 34
    .line 35
    return v4

    .line 36
    :cond_0
    const-string v1, "Offset to end of mdat was negative."

    .line 37
    .line 38
    invoke-static {v1, v3}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    throw v1

    .line 43
    :cond_1
    invoke-virtual {v2}, Lo3/h$b;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    invoke-interface {v1}, LU2/q;->getPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sub-long/2addr v5, v7

    .line 52
    long-to-int v5, v5

    .line 53
    if-gez v5, :cond_2

    .line 54
    .line 55
    const-string v5, "FragmentedMp4Extractor"

    .line 56
    .line 57
    const-string v6, "Ignoring negative offset to sample data."

    .line 58
    .line 59
    invoke-static {v5, v6}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move v5, v4

    .line 63
    :cond_2
    invoke-interface {v1, v5}, LU2/q;->m(I)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Lo3/h;->D:Lo3/h$b;

    .line 67
    .line 68
    :cond_3
    iget v5, v0, Lo3/h;->t:I

    .line 69
    .line 70
    const/4 v6, 0x3

    .line 71
    const/4 v7, 0x4

    .line 72
    const/4 v8, 0x1

    .line 73
    if-ne v5, v6, :cond_8

    .line 74
    .line 75
    invoke-virtual {v2}, Lo3/h$b;->f()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iput v5, v0, Lo3/h;->E:I

    .line 80
    .line 81
    iget-object v5, v2, Lo3/h$b;->d:Lo3/w;

    .line 82
    .line 83
    iget-object v5, v5, Lo3/w;->a:Lo3/t;

    .line 84
    .line 85
    iget-object v5, v5, Lo3/t;->g:Lq2/x;

    .line 86
    .line 87
    invoke-direct {v0, v5}, Lo3/h;->g(Lq2/x;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    xor-int/2addr v5, v8

    .line 92
    iput-boolean v5, v0, Lo3/h;->H:Z

    .line 93
    .line 94
    iget v5, v2, Lo3/h$b;->f:I

    .line 95
    .line 96
    iget v9, v2, Lo3/h$b;->i:I

    .line 97
    .line 98
    if-ge v5, v9, :cond_5

    .line 99
    .line 100
    iget v4, v0, Lo3/h;->E:I

    .line 101
    .line 102
    invoke-interface {v1, v4}, LU2/q;->m(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Lo3/h$b;->m()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lo3/h$b;->h()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    iput-object v3, v0, Lo3/h;->D:Lo3/h$b;

    .line 115
    .line 116
    :cond_4
    iput v6, v0, Lo3/h;->t:I

    .line 117
    .line 118
    return v8

    .line 119
    :cond_5
    iget-object v5, v2, Lo3/h$b;->d:Lo3/w;

    .line 120
    .line 121
    iget-object v5, v5, Lo3/w;->a:Lo3/t;

    .line 122
    .line 123
    iget v5, v5, Lo3/t;->h:I

    .line 124
    .line 125
    if-ne v5, v8, :cond_6

    .line 126
    .line 127
    iget v5, v0, Lo3/h;->E:I

    .line 128
    .line 129
    const/16 v9, 0x8

    .line 130
    .line 131
    sub-int/2addr v5, v9

    .line 132
    iput v5, v0, Lo3/h;->E:I

    .line 133
    .line 134
    invoke-interface {v1, v9}, LU2/q;->m(I)V

    .line 135
    .line 136
    .line 137
    :cond_6
    iget-object v5, v2, Lo3/h$b;->d:Lo3/w;

    .line 138
    .line 139
    iget-object v5, v5, Lo3/w;->a:Lo3/t;

    .line 140
    .line 141
    iget-object v5, v5, Lo3/t;->g:Lq2/x;

    .line 142
    .line 143
    iget-object v5, v5, Lq2/x;->o:Ljava/lang/String;

    .line 144
    .line 145
    const-string v9, "audio/ac4"

    .line 146
    .line 147
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_7

    .line 152
    .line 153
    iget v5, v0, Lo3/h;->E:I

    .line 154
    .line 155
    const/4 v9, 0x7

    .line 156
    invoke-virtual {v2, v5, v9}, Lo3/h$b;->i(II)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    iput v5, v0, Lo3/h;->F:I

    .line 161
    .line 162
    iget v5, v0, Lo3/h;->E:I

    .line 163
    .line 164
    iget-object v10, v0, Lo3/h;->j:Lt2/I;

    .line 165
    .line 166
    invoke-static {v5, v10}, LU2/c;->b(ILt2/I;)V

    .line 167
    .line 168
    .line 169
    iget-object v5, v2, Lo3/h$b;->a:LU2/O;

    .line 170
    .line 171
    iget-object v10, v0, Lo3/h;->j:Lt2/I;

    .line 172
    .line 173
    invoke-interface {v5, v10, v9}, LU2/O;->f(Lt2/I;I)V

    .line 174
    .line 175
    .line 176
    iget v5, v0, Lo3/h;->F:I

    .line 177
    .line 178
    add-int/2addr v5, v9

    .line 179
    iput v5, v0, Lo3/h;->F:I

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_7
    iget v5, v0, Lo3/h;->E:I

    .line 183
    .line 184
    invoke-virtual {v2, v5, v4}, Lo3/h$b;->i(II)I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    iput v5, v0, Lo3/h;->F:I

    .line 189
    .line 190
    :goto_0
    iget v5, v0, Lo3/h;->E:I

    .line 191
    .line 192
    iget v9, v0, Lo3/h;->F:I

    .line 193
    .line 194
    add-int/2addr v5, v9

    .line 195
    iput v5, v0, Lo3/h;->E:I

    .line 196
    .line 197
    iput v7, v0, Lo3/h;->t:I

    .line 198
    .line 199
    iput v4, v0, Lo3/h;->G:I

    .line 200
    .line 201
    :cond_8
    iget-object v5, v2, Lo3/h$b;->d:Lo3/w;

    .line 202
    .line 203
    iget-object v5, v5, Lo3/w;->a:Lo3/t;

    .line 204
    .line 205
    iget-object v9, v2, Lo3/h$b;->a:LU2/O;

    .line 206
    .line 207
    invoke-virtual {v2}, Lo3/h$b;->e()J

    .line 208
    .line 209
    .line 210
    move-result-wide v10

    .line 211
    iget-object v12, v0, Lo3/h;->k:Lt2/O;

    .line 212
    .line 213
    if-eqz v12, :cond_9

    .line 214
    .line 215
    invoke-virtual {v12, v10, v11}, Lt2/O;->a(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    :cond_9
    iget v12, v5, Lo3/t;->k:I

    .line 220
    .line 221
    if-eqz v12, :cond_14

    .line 222
    .line 223
    iget-object v12, v0, Lo3/h;->g:Lt2/I;

    .line 224
    .line 225
    invoke-virtual {v12}, Lt2/I;->f()[B

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    aput-byte v4, v12, v4

    .line 230
    .line 231
    aput-byte v4, v12, v8

    .line 232
    .line 233
    const/4 v13, 0x2

    .line 234
    aput-byte v4, v12, v13

    .line 235
    .line 236
    iget v13, v5, Lo3/t;->k:I

    .line 237
    .line 238
    rsub-int/lit8 v13, v13, 0x4

    .line 239
    .line 240
    :goto_1
    iget v14, v0, Lo3/h;->F:I

    .line 241
    .line 242
    iget v15, v0, Lo3/h;->E:I

    .line 243
    .line 244
    if-ge v14, v15, :cond_15

    .line 245
    .line 246
    iget v14, v0, Lo3/h;->G:I

    .line 247
    .line 248
    if-nez v14, :cond_f

    .line 249
    .line 250
    iget-object v14, v0, Lo3/h;->L:[LU2/O;

    .line 251
    .line 252
    array-length v14, v14

    .line 253
    if-gtz v14, :cond_a

    .line 254
    .line 255
    iget-boolean v14, v0, Lo3/h;->H:Z

    .line 256
    .line 257
    if-nez v14, :cond_b

    .line 258
    .line 259
    :cond_a
    iget-object v14, v5, Lo3/t;->g:Lq2/x;

    .line 260
    .line 261
    invoke-static {v14}, Lu2/h;->o(Lq2/x;)I

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    iget v15, v5, Lo3/t;->k:I

    .line 266
    .line 267
    add-int/2addr v15, v14

    .line 268
    iget v6, v0, Lo3/h;->E:I

    .line 269
    .line 270
    iget v3, v0, Lo3/h;->F:I

    .line 271
    .line 272
    sub-int/2addr v6, v3

    .line 273
    if-gt v15, v6, :cond_b

    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_b
    move v14, v4

    .line 277
    :goto_2
    iget v3, v5, Lo3/t;->k:I

    .line 278
    .line 279
    add-int/2addr v3, v14

    .line 280
    invoke-interface {v1, v12, v13, v3}, LU2/q;->readFully([BII)V

    .line 281
    .line 282
    .line 283
    iget-object v3, v0, Lo3/h;->g:Lt2/I;

    .line 284
    .line 285
    invoke-virtual {v3, v4}, Lt2/I;->b0(I)V

    .line 286
    .line 287
    .line 288
    iget-object v3, v0, Lo3/h;->g:Lt2/I;

    .line 289
    .line 290
    invoke-virtual {v3}, Lt2/I;->v()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-ltz v3, :cond_e

    .line 295
    .line 296
    sub-int/2addr v3, v14

    .line 297
    iput v3, v0, Lo3/h;->G:I

    .line 298
    .line 299
    iget-object v3, v0, Lo3/h;->f:Lt2/I;

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Lt2/I;->b0(I)V

    .line 302
    .line 303
    .line 304
    iget-object v3, v0, Lo3/h;->f:Lt2/I;

    .line 305
    .line 306
    invoke-interface {v9, v3, v7}, LU2/O;->f(Lt2/I;I)V

    .line 307
    .line 308
    .line 309
    iget v3, v0, Lo3/h;->F:I

    .line 310
    .line 311
    add-int/2addr v3, v7

    .line 312
    iput v3, v0, Lo3/h;->F:I

    .line 313
    .line 314
    iget v3, v0, Lo3/h;->E:I

    .line 315
    .line 316
    add-int/2addr v3, v13

    .line 317
    iput v3, v0, Lo3/h;->E:I

    .line 318
    .line 319
    iget-object v3, v0, Lo3/h;->L:[LU2/O;

    .line 320
    .line 321
    array-length v3, v3

    .line 322
    if-lez v3, :cond_c

    .line 323
    .line 324
    if-lez v14, :cond_c

    .line 325
    .line 326
    iget-object v3, v5, Lo3/t;->g:Lq2/x;

    .line 327
    .line 328
    aget-byte v6, v12, v7

    .line 329
    .line 330
    invoke-static {v3, v6}, Lu2/h;->n(Lq2/x;B)Z

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    if-eqz v3, :cond_c

    .line 335
    .line 336
    move v3, v8

    .line 337
    goto :goto_3

    .line 338
    :cond_c
    move v3, v4

    .line 339
    :goto_3
    iput-boolean v3, v0, Lo3/h;->I:Z

    .line 340
    .line 341
    iget-object v3, v0, Lo3/h;->g:Lt2/I;

    .line 342
    .line 343
    invoke-interface {v9, v3, v14}, LU2/O;->f(Lt2/I;I)V

    .line 344
    .line 345
    .line 346
    iget v3, v0, Lo3/h;->F:I

    .line 347
    .line 348
    add-int/2addr v3, v14

    .line 349
    iput v3, v0, Lo3/h;->F:I

    .line 350
    .line 351
    if-lez v14, :cond_d

    .line 352
    .line 353
    iget-boolean v3, v0, Lo3/h;->H:Z

    .line 354
    .line 355
    if-nez v3, :cond_d

    .line 356
    .line 357
    iget-object v3, v5, Lo3/t;->g:Lq2/x;

    .line 358
    .line 359
    invoke-static {v12, v7, v14, v3}, Lu2/h;->k([BIILq2/x;)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_d

    .line 364
    .line 365
    iput-boolean v8, v0, Lo3/h;->H:Z

    .line 366
    .line 367
    :cond_d
    :goto_4
    const/4 v3, 0x0

    .line 368
    const/4 v6, 0x3

    .line 369
    goto/16 :goto_1

    .line 370
    .line 371
    :cond_e
    const-string v1, "Invalid NAL length"

    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    invoke-static {v1, v2}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    throw v1

    .line 379
    :cond_f
    iget-boolean v3, v0, Lo3/h;->I:Z

    .line 380
    .line 381
    if-eqz v3, :cond_12

    .line 382
    .line 383
    iget-object v3, v0, Lo3/h;->h:Lt2/I;

    .line 384
    .line 385
    invoke-virtual {v3, v14}, Lt2/I;->X(I)V

    .line 386
    .line 387
    .line 388
    iget-object v3, v0, Lo3/h;->h:Lt2/I;

    .line 389
    .line 390
    invoke-virtual {v3}, Lt2/I;->f()[B

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    iget v6, v0, Lo3/h;->G:I

    .line 395
    .line 396
    invoke-interface {v1, v3, v4, v6}, LU2/q;->readFully([BII)V

    .line 397
    .line 398
    .line 399
    iget-object v3, v0, Lo3/h;->h:Lt2/I;

    .line 400
    .line 401
    iget v6, v0, Lo3/h;->G:I

    .line 402
    .line 403
    invoke-interface {v9, v3, v6}, LU2/O;->f(Lt2/I;I)V

    .line 404
    .line 405
    .line 406
    iget v3, v0, Lo3/h;->G:I

    .line 407
    .line 408
    iget-object v6, v0, Lo3/h;->h:Lt2/I;

    .line 409
    .line 410
    invoke-virtual {v6}, Lt2/I;->f()[B

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    iget-object v14, v0, Lo3/h;->h:Lt2/I;

    .line 415
    .line 416
    invoke-virtual {v14}, Lt2/I;->j()I

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    invoke-static {v6, v14}, Lu2/h;->L([BI)I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    iget-object v14, v0, Lo3/h;->h:Lt2/I;

    .line 425
    .line 426
    invoke-virtual {v14, v4}, Lt2/I;->b0(I)V

    .line 427
    .line 428
    .line 429
    iget-object v14, v0, Lo3/h;->h:Lt2/I;

    .line 430
    .line 431
    invoke-virtual {v14, v6}, Lt2/I;->a0(I)V

    .line 432
    .line 433
    .line 434
    iget-object v6, v5, Lo3/t;->g:Lq2/x;

    .line 435
    .line 436
    iget v6, v6, Lq2/x;->q:I

    .line 437
    .line 438
    const/4 v14, -0x1

    .line 439
    if-ne v6, v14, :cond_10

    .line 440
    .line 441
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 442
    .line 443
    invoke-virtual {v6}, Lu2/k;->f()I

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    if-eqz v6, :cond_11

    .line 448
    .line 449
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 450
    .line 451
    invoke-virtual {v6, v4}, Lu2/k;->g(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_10
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 456
    .line 457
    invoke-virtual {v6}, Lu2/k;->f()I

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    iget-object v14, v5, Lo3/t;->g:Lq2/x;

    .line 462
    .line 463
    iget v14, v14, Lq2/x;->q:I

    .line 464
    .line 465
    if-eq v6, v14, :cond_11

    .line 466
    .line 467
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 468
    .line 469
    invoke-virtual {v6, v14}, Lu2/k;->g(I)V

    .line 470
    .line 471
    .line 472
    :cond_11
    :goto_5
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 473
    .line 474
    iget-object v14, v0, Lo3/h;->h:Lt2/I;

    .line 475
    .line 476
    invoke-virtual {v6, v10, v11, v14}, Lu2/k;->a(JLt2/I;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Lo3/h$b;->c()I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    and-int/2addr v6, v7

    .line 484
    if-eqz v6, :cond_13

    .line 485
    .line 486
    iget-object v6, v0, Lo3/h;->p:Lu2/k;

    .line 487
    .line 488
    invoke-virtual {v6}, Lu2/k;->d()V

    .line 489
    .line 490
    .line 491
    goto :goto_6

    .line 492
    :cond_12
    invoke-interface {v9, v1, v14, v4}, LU2/O;->e(Lq2/m;IZ)I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    :cond_13
    :goto_6
    iget v6, v0, Lo3/h;->F:I

    .line 497
    .line 498
    add-int/2addr v6, v3

    .line 499
    iput v6, v0, Lo3/h;->F:I

    .line 500
    .line 501
    iget v6, v0, Lo3/h;->G:I

    .line 502
    .line 503
    sub-int/2addr v6, v3

    .line 504
    iput v6, v0, Lo3/h;->G:I

    .line 505
    .line 506
    goto/16 :goto_4

    .line 507
    .line 508
    :cond_14
    :goto_7
    iget v3, v0, Lo3/h;->F:I

    .line 509
    .line 510
    iget v5, v0, Lo3/h;->E:I

    .line 511
    .line 512
    if-ge v3, v5, :cond_15

    .line 513
    .line 514
    sub-int/2addr v5, v3

    .line 515
    invoke-interface {v9, v1, v5, v4}, LU2/O;->e(Lq2/m;IZ)I

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    iget v5, v0, Lo3/h;->F:I

    .line 520
    .line 521
    add-int/2addr v5, v3

    .line 522
    iput v5, v0, Lo3/h;->F:I

    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_15
    invoke-virtual {v2}, Lo3/h$b;->c()I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    iget-boolean v3, v0, Lo3/h;->H:Z

    .line 530
    .line 531
    if-nez v3, :cond_16

    .line 532
    .line 533
    const/high16 v3, 0x4000000

    .line 534
    .line 535
    or-int/2addr v1, v3

    .line 536
    :cond_16
    move v12, v1

    .line 537
    invoke-virtual {v2}, Lo3/h$b;->g()Lo3/u;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    if-eqz v1, :cond_17

    .line 542
    .line 543
    iget-object v1, v1, Lo3/u;->c:LU2/O$a;

    .line 544
    .line 545
    move-object v15, v1

    .line 546
    goto :goto_8

    .line 547
    :cond_17
    const/4 v15, 0x0

    .line 548
    :goto_8
    iget v13, v0, Lo3/h;->E:I

    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    invoke-interface/range {v9 .. v15}, LU2/O;->a(JIIILU2/O$a;)V

    .line 552
    .line 553
    .line 554
    invoke-direct {v0, v10, v11}, Lo3/h;->A(J)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Lo3/h$b;->h()Z

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    if-nez v1, :cond_18

    .line 562
    .line 563
    const/4 v2, 0x0

    .line 564
    iput-object v2, v0, Lo3/h;->D:Lo3/h$b;

    .line 565
    .line 566
    :cond_18
    const/4 v1, 0x3

    .line 567
    iput v1, v0, Lo3/h;->t:I

    .line 568
    .line 569
    return v8
.end method

.method private static V(I)Z
    .locals 1

    .line 1
    const v0, 0x6d6f6f76

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x7472616b

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x6d646961

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x6d696e66

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const v0, 0x7374626c

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const v0, 0x6d6f6f66

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    const v0, 0x74726166

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_1

    .line 35
    .line 36
    const v0, 0x6d766578

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    const v0, 0x65647473

    .line 42
    .line 43
    .line 44
    if-eq p0, v0, :cond_1

    .line 45
    .line 46
    const v0, 0x6d657461

    .line 47
    .line 48
    .line 49
    if-ne p0, v0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 55
    return p0
.end method

.method private static W(I)Z
    .locals 1

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x6d646864

    .line 7
    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const v0, 0x6d766864

    .line 12
    .line 13
    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x73696478

    .line 17
    .line 18
    .line 19
    if-eq p0, v0, :cond_1

    .line 20
    .line 21
    const v0, 0x73747364

    .line 22
    .line 23
    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const v0, 0x73747473

    .line 27
    .line 28
    .line 29
    if-eq p0, v0, :cond_1

    .line 30
    .line 31
    const v0, 0x63747473

    .line 32
    .line 33
    .line 34
    if-eq p0, v0, :cond_1

    .line 35
    .line 36
    const v0, 0x73747363

    .line 37
    .line 38
    .line 39
    if-eq p0, v0, :cond_1

    .line 40
    .line 41
    const v0, 0x7374737a

    .line 42
    .line 43
    .line 44
    if-eq p0, v0, :cond_1

    .line 45
    .line 46
    const v0, 0x73747a32

    .line 47
    .line 48
    .line 49
    if-eq p0, v0, :cond_1

    .line 50
    .line 51
    const v0, 0x7374636f

    .line 52
    .line 53
    .line 54
    if-eq p0, v0, :cond_1

    .line 55
    .line 56
    const v0, 0x636f3634

    .line 57
    .line 58
    .line 59
    if-eq p0, v0, :cond_1

    .line 60
    .line 61
    const v0, 0x73747373

    .line 62
    .line 63
    .line 64
    if-eq p0, v0, :cond_1

    .line 65
    .line 66
    const v0, 0x74666474

    .line 67
    .line 68
    .line 69
    if-eq p0, v0, :cond_1

    .line 70
    .line 71
    const v0, 0x74666864

    .line 72
    .line 73
    .line 74
    if-eq p0, v0, :cond_1

    .line 75
    .line 76
    const v0, 0x746b6864

    .line 77
    .line 78
    .line 79
    if-eq p0, v0, :cond_1

    .line 80
    .line 81
    const v0, 0x74726578

    .line 82
    .line 83
    .line 84
    if-eq p0, v0, :cond_1

    .line 85
    .line 86
    const v0, 0x7472756e

    .line 87
    .line 88
    .line 89
    if-eq p0, v0, :cond_1

    .line 90
    .line 91
    const v0, 0x70737368    # 3.013775E29f

    .line 92
    .line 93
    .line 94
    if-eq p0, v0, :cond_1

    .line 95
    .line 96
    const v0, 0x7361697a

    .line 97
    .line 98
    .line 99
    if-eq p0, v0, :cond_1

    .line 100
    .line 101
    const v0, 0x7361696f

    .line 102
    .line 103
    .line 104
    if-eq p0, v0, :cond_1

    .line 105
    .line 106
    const v0, 0x73656e63

    .line 107
    .line 108
    .line 109
    if-eq p0, v0, :cond_1

    .line 110
    .line 111
    const v0, 0x75756964

    .line 112
    .line 113
    .line 114
    if-eq p0, v0, :cond_1

    .line 115
    .line 116
    const v0, 0x73626770

    .line 117
    .line 118
    .line 119
    if-eq p0, v0, :cond_1

    .line 120
    .line 121
    const v0, 0x73677064

    .line 122
    .line 123
    .line 124
    if-eq p0, v0, :cond_1

    .line 125
    .line 126
    const v0, 0x656c7374

    .line 127
    .line 128
    .line 129
    if-eq p0, v0, :cond_1

    .line 130
    .line 131
    const v0, 0x6d656864

    .line 132
    .line 133
    .line 134
    if-eq p0, v0, :cond_1

    .line 135
    .line 136
    const v0, 0x656d7367

    .line 137
    .line 138
    .line 139
    if-eq p0, v0, :cond_1

    .line 140
    .line 141
    const v0, 0x75647461

    .line 142
    .line 143
    .line 144
    if-eq p0, v0, :cond_1

    .line 145
    .line 146
    const v0, 0x6b657973

    .line 147
    .line 148
    .line 149
    if-eq p0, v0, :cond_1

    .line 150
    .line 151
    const v0, 0x696c7374

    .line 152
    .line 153
    .line 154
    if-ne p0, v0, :cond_0

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    const/4 p0, 0x0

    .line 158
    return p0

    .line 159
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 160
    return p0
.end method

.method public static synthetic d()[LU2/p;
    .locals 3

    .line 1
    new-instance v0, Lo3/h;

    .line 2
    .line 3
    sget-object v1, Lr3/r$a;->a:Lr3/r$a;

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lo3/h;-><init>(Lr3/r$a;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v1, v1, [LU2/p;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    return-object v1
.end method

.method public static synthetic e(Lo3/h;JLt2/I;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lo3/h;->L:[LU2/O;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, p0}, LU2/f;->a(JLt2/I;[LU2/O;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private g(Lq2/x;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Lq2/x;->o:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget p1, p0, Lo3/h;->b:I

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x40

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    return v2

    .line 21
    :cond_1
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 22
    .line 23
    const-string v0, "video/hevc"

    .line 24
    .line 25
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget p1, p0, Lo3/h;->b:I

    .line 32
    .line 33
    and-int/lit16 p1, p1, 0x80

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    return v1

    .line 38
    :cond_2
    return v2
.end method

.method private static j(I)I
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "Unexpected negative value: "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    throw p0
.end method

.method public static k(I)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x40

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    or-int/lit16 p0, v0, 0x80

    .line 14
    .line 15
    return p0

    .line 16
    :cond_1
    return v0
.end method

.method private m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo3/h;->t:I

    .line 3
    .line 4
    iput v0, p0, Lo3/h;->w:I

    .line 5
    .line 6
    return-void
.end method

.method private n(Landroid/util/SparseArray;I)Lo3/c;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lo3/c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lo3/c;

    .line 21
    .line 22
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lo3/c;

    .line 27
    .line 28
    return-object p1
.end method

.method private static o(Ljava/util/List;)Lq2/q;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_3

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Lu2/e$c;

    .line 15
    .line 16
    iget v5, v4, Lu2/e;->a:I

    .line 17
    .line 18
    const v6, 0x70737368    # 3.013775E29f

    .line 19
    .line 20
    .line 21
    if-ne v5, v6, :cond_2

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v4, v4, Lu2/e$c;->b:Lt2/I;

    .line 31
    .line 32
    invoke-virtual {v4}, Lt2/I;->f()[B

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lo3/p;->f([B)Ljava/util/UUID;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    const-string v4, "FragmentedMp4Extractor"

    .line 43
    .line 44
    const-string v5, "Skipped pssh atom (failed to extract uuid)"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v6, Lq2/q$b;

    .line 51
    .line 52
    const-string v7, "video/mp4"

    .line 53
    .line 54
    invoke-direct {v6, v5, v7, v4}, Lq2/q$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-nez v3, :cond_4

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_4
    new-instance p0, Lq2/q;

    .line 67
    .line 68
    invoke-direct {p0, v3}, Lq2/q;-><init>(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method private static p(Landroid/util/SparseArray;)Lo3/h$b;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Lo3/h$b;

    .line 19
    .line 20
    invoke-static {v5}, Lo3/h$b;->a(Lo3/h$b;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iget v6, v5, Lo3/h$b;->f:I

    .line 27
    .line 28
    iget-object v7, v5, Lo3/h$b;->d:Lo3/w;

    .line 29
    .line 30
    iget v7, v7, Lo3/w;->b:I

    .line 31
    .line 32
    if-eq v6, v7, :cond_2

    .line 33
    .line 34
    :cond_0
    invoke-static {v5}, Lo3/h$b;->a(Lo3/h$b;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget v6, v5, Lo3/h$b;->h:I

    .line 41
    .line 42
    iget-object v7, v5, Lo3/h$b;->b:Lo3/v;

    .line 43
    .line 44
    iget v7, v7, Lo3/v;->e:I

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v5}, Lo3/h$b;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v2

    .line 54
    .line 55
    if-gez v8, :cond_2

    .line 56
    .line 57
    move-object v1, v5

    .line 58
    move-wide v2, v6

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-object v1
.end method

.method private r()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LU2/O;

    .line 3
    .line 4
    iput-object v0, p0, Lo3/h;->K:[LU2/O;

    .line 5
    .line 6
    iget-object v1, p0, Lo3/h;->q:LU2/O;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v2

    .line 16
    :goto_0
    iget v3, p0, Lo3/h;->b:I

    .line 17
    .line 18
    and-int/lit8 v3, v3, 0x4

    .line 19
    .line 20
    const/16 v4, 0x64

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    iget-object v5, p0, Lo3/h;->J:LU2/r;

    .line 27
    .line 28
    const/4 v6, 0x5

    .line 29
    invoke-interface {v5, v4, v6}, LU2/r;->e(II)LU2/O;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v1

    .line 34
    .line 35
    const/16 v4, 0x65

    .line 36
    .line 37
    move v1, v3

    .line 38
    :cond_1
    iget-object v0, p0, Lo3/h;->K:[LU2/O;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lt2/a0;->b1([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [LU2/O;

    .line 45
    .line 46
    iput-object v0, p0, Lo3/h;->K:[LU2/O;

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v1, :cond_2

    .line 51
    .line 52
    aget-object v5, v0, v3

    .line 53
    .line 54
    sget-object v6, Lo3/h;->R:Lq2/x;

    .line 55
    .line 56
    invoke-interface {v5, v6}, LU2/O;->c(Lq2/x;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v0, p0, Lo3/h;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-array v0, v0, [LU2/O;

    .line 69
    .line 70
    iput-object v0, p0, Lo3/h;->L:[LU2/O;

    .line 71
    .line 72
    :goto_2
    iget-object v0, p0, Lo3/h;->L:[LU2/O;

    .line 73
    .line 74
    array-length v0, v0

    .line 75
    if-ge v2, v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Lo3/h;->J:LU2/r;

    .line 78
    .line 79
    add-int/lit8 v1, v4, 0x1

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    invoke-interface {v0, v4, v3}, LU2/r;->e(II)LU2/O;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, p0, Lo3/h;->d:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lq2/x;

    .line 93
    .line 94
    invoke-interface {v0, v3}, LU2/O;->c(Lq2/x;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lo3/h;->L:[LU2/O;

    .line 98
    .line 99
    aput-object v0, v3, v2

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    move v4, v1

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    return-void
.end method

.method private static s(Lo3/t;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lo3/t;->i:[J

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v2, v3, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, Lo3/t;->j:[J

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget-wide v4, v0, v1

    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    cmp-long v0, v4, v6

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return v3

    .line 24
    :cond_1
    const-wide/32 v6, 0xf4240

    .line 25
    .line 26
    .line 27
    iget-wide v8, p0, Lo3/t;->d:J

    .line 28
    .line 29
    invoke-static/range {v4 .. v9}, Lt2/a0;->m1(JJJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    iget-object v0, p0, Lo3/t;->j:[J

    .line 34
    .line 35
    aget-wide v6, v0, v1

    .line 36
    .line 37
    const-wide/32 v8, 0xf4240

    .line 38
    .line 39
    .line 40
    iget-wide v10, p0, Lo3/t;->c:J

    .line 41
    .line 42
    invoke-static/range {v6 .. v11}, Lt2/a0;->m1(JJJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    add-long/2addr v4, v6

    .line 47
    iget-wide v6, p0, Lo3/t;->e:J

    .line 48
    .line 49
    cmp-long p0, v4, v6

    .line 50
    .line 51
    if-ltz p0, :cond_2

    .line 52
    .line 53
    return v3

    .line 54
    :cond_2
    :goto_0
    return v1
.end method

.method private t(LU2/q;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt2/I;->X(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 9
    .line 10
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-interface {p1, v0, v2, v1}, LU2/q;->o([BII)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 19
    .line 20
    invoke-static {v0}, Lo3/b;->g(Lt2/I;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lo3/h;->j:Lt2/I;

    .line 24
    .line 25
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-interface {p1, v0}, LU2/q;->m(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, LU2/q;->g()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private v(Lu2/e$b;)V
    .locals 2

    .line 1
    iget v0, p1, Lu2/e;->a:I

    .line 2
    .line 3
    const v1, 0x6d6f6f76

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lo3/h;->z(Lu2/e$b;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const v1, 0x6d6f6f66

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lo3/h;->y(Lu2/e$b;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lu2/e$b;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lu2/e$b;->b(Lu2/e$b;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method private w(Lt2/I;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lo3/h;->K:[LU2/O;

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lt2/I;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lt2/I;->v()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v2}, Lo3/b;->q(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    if-eq v2, v3, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v3, "Skipping unsupported emsg version: "

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "FragmentedMp4Extractor"

    .line 53
    .line 54
    invoke-static {v2, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 59
    .line 60
    .line 61
    move-result-wide v10

    .line 62
    invoke-virtual {v1}, Lt2/I;->T()J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    const-wide/32 v8, 0xf4240

    .line 67
    .line 68
    .line 69
    invoke-static/range {v6 .. v11}, Lt2/a0;->m1(JJJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v12

    .line 73
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    const-wide/16 v8, 0x3e8

    .line 78
    .line 79
    invoke-static/range {v6 .. v11}, Lt2/a0;->m1(JJJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 84
    .line 85
    .line 86
    move-result-wide v8

    .line 87
    invoke-virtual {v1}, Lt2/I;->G()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v1}, Lt2/I;->G()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v10}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    check-cast v10, Ljava/lang/String;

    .line 106
    .line 107
    move-wide/from16 v18, v6

    .line 108
    .line 109
    move-wide/from16 v20, v8

    .line 110
    .line 111
    move-wide v6, v4

    .line 112
    :goto_0
    move-object/from16 v16, v2

    .line 113
    .line 114
    move-object/from16 v17, v10

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-virtual {v1}, Lt2/I;->G()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v1}, Lt2/I;->G()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v6}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    move-object v10, v6

    .line 136
    check-cast v10, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 143
    .line 144
    .line 145
    move-result-wide v11

    .line 146
    const-wide/32 v13, 0xf4240

    .line 147
    .line 148
    .line 149
    invoke-static/range {v11 .. v16}, Lt2/a0;->m1(JJJ)J

    .line 150
    .line 151
    .line 152
    move-result-wide v6

    .line 153
    iget-wide v8, v0, Lo3/h;->C:J

    .line 154
    .line 155
    cmp-long v11, v8, v4

    .line 156
    .line 157
    if-eqz v11, :cond_3

    .line 158
    .line 159
    add-long/2addr v8, v6

    .line 160
    goto :goto_1

    .line 161
    :cond_3
    move-wide v8, v4

    .line 162
    :goto_1
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 163
    .line 164
    .line 165
    move-result-wide v11

    .line 166
    const-wide/16 v13, 0x3e8

    .line 167
    .line 168
    invoke-static/range {v11 .. v16}, Lt2/a0;->m1(JJJ)J

    .line 169
    .line 170
    .line 171
    move-result-wide v11

    .line 172
    invoke-virtual {v1}, Lt2/I;->O()J

    .line 173
    .line 174
    .line 175
    move-result-wide v13

    .line 176
    move-wide/from16 v18, v11

    .line 177
    .line 178
    move-wide/from16 v20, v13

    .line 179
    .line 180
    move-wide v12, v8

    .line 181
    goto :goto_0

    .line 182
    :goto_2
    invoke-virtual {v1}, Lt2/I;->a()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    new-array v2, v2, [B

    .line 187
    .line 188
    invoke-virtual {v1}, Lt2/I;->a()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    const/4 v9, 0x0

    .line 193
    invoke-virtual {v1, v2, v9, v8}, Lt2/I;->q([BII)V

    .line 194
    .line 195
    .line 196
    new-instance v15, Lf3/a;

    .line 197
    .line 198
    move-object/from16 v22, v2

    .line 199
    .line 200
    invoke-direct/range {v15 .. v22}, Lf3/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lt2/I;

    .line 204
    .line 205
    iget-object v2, v0, Lo3/h;->l:Lf3/c;

    .line 206
    .line 207
    invoke-virtual {v2, v15}, Lf3/c;->a(Lf3/a;)[B

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v1, v2}, Lt2/I;-><init>([B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Lt2/I;->a()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    iget-object v8, v0, Lo3/h;->K:[LU2/O;

    .line 219
    .line 220
    array-length v10, v8

    .line 221
    move v11, v9

    .line 222
    :goto_3
    if-ge v11, v10, :cond_4

    .line 223
    .line 224
    aget-object v14, v8, v11

    .line 225
    .line 226
    invoke-virtual {v1, v9}, Lt2/I;->b0(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v14, v1, v2}, LU2/O;->f(Lt2/I;I)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v11, v11, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_4
    cmp-long v1, v12, v4

    .line 236
    .line 237
    if-nez v1, :cond_5

    .line 238
    .line 239
    iget-object v1, v0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 240
    .line 241
    new-instance v4, Lo3/h$a;

    .line 242
    .line 243
    invoke-direct {v4, v6, v7, v3, v2}, Lo3/h$a;-><init>(JZI)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    iget v1, v0, Lo3/h;->z:I

    .line 250
    .line 251
    add-int/2addr v1, v2

    .line 252
    iput v1, v0, Lo3/h;->z:I

    .line 253
    .line 254
    return-void

    .line 255
    :cond_5
    iget-object v1, v0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-nez v1, :cond_6

    .line 262
    .line 263
    iget-object v1, v0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 264
    .line 265
    new-instance v3, Lo3/h$a;

    .line 266
    .line 267
    invoke-direct {v3, v12, v13, v9, v2}, Lo3/h$a;-><init>(JZI)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    iget v1, v0, Lo3/h;->z:I

    .line 274
    .line 275
    add-int/2addr v1, v2

    .line 276
    iput v1, v0, Lo3/h;->z:I

    .line 277
    .line 278
    return-void

    .line 279
    :cond_6
    iget-object v1, v0, Lo3/h;->k:Lt2/O;

    .line 280
    .line 281
    if-eqz v1, :cond_7

    .line 282
    .line 283
    invoke-virtual {v1}, Lt2/O;->g()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_7

    .line 288
    .line 289
    iget-object v1, v0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 290
    .line 291
    new-instance v3, Lo3/h$a;

    .line 292
    .line 293
    invoke-direct {v3, v12, v13, v9, v2}, Lo3/h$a;-><init>(JZI)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget v1, v0, Lo3/h;->z:I

    .line 300
    .line 301
    add-int/2addr v1, v2

    .line 302
    iput v1, v0, Lo3/h;->z:I

    .line 303
    .line 304
    return-void

    .line 305
    :cond_7
    iget-object v1, v0, Lo3/h;->k:Lt2/O;

    .line 306
    .line 307
    if-eqz v1, :cond_8

    .line 308
    .line 309
    invoke-virtual {v1, v12, v13}, Lt2/O;->a(J)J

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    :cond_8
    move-wide v15, v12

    .line 314
    iget-object v1, v0, Lo3/h;->K:[LU2/O;

    .line 315
    .line 316
    array-length v3, v1

    .line 317
    :goto_4
    if-ge v9, v3, :cond_9

    .line 318
    .line 319
    aget-object v14, v1, v9

    .line 320
    .line 321
    const/16 v19, 0x0

    .line 322
    .line 323
    const/16 v20, 0x0

    .line 324
    .line 325
    const/16 v17, 0x1

    .line 326
    .line 327
    move/from16 v18, v2

    .line 328
    .line 329
    invoke-interface/range {v14 .. v20}, LU2/O;->a(JIIILU2/O$a;)V

    .line 330
    .line 331
    .line 332
    add-int/lit8 v9, v9, 0x1

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_9
    :goto_5
    return-void
.end method

.method private x(Lu2/e$c;LU2/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lu2/e$b;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lu2/e$b;->c(Lu2/e$c;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v0, p1, Lu2/e;->a:I

    .line 22
    .line 23
    const v1, 0x73696478

    .line 24
    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget-object p1, p1, Lu2/e$c;->b:Lt2/I;

    .line 29
    .line 30
    invoke-interface {p2}, LU2/q;->getPosition()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p1, v0, v1}, Lo3/h;->I(Lt2/I;J)Landroid/util/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v0, p0, Lo3/h;->r:LU2/h;

    .line 39
    .line 40
    iget-object v1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, LU2/g;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LU2/h;->a(LU2/g;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, p0, Lo3/h;->M:Z

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    iput-wide v2, p0, Lo3/h;->C:J

    .line 61
    .line 62
    iget-object p2, p0, Lo3/h;->J:LU2/r;

    .line 63
    .line 64
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, LU2/J;

    .line 67
    .line 68
    invoke-interface {p2, p1}, LU2/r;->t(LU2/J;)V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p0, Lo3/h;->M:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    iget p1, p0, Lo3/h;->b:I

    .line 75
    .line 76
    and-int/lit16 p1, p1, 0x100

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget-boolean p1, p0, Lo3/h;->N:Z

    .line 81
    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    iget-object p1, p0, Lo3/h;->r:LU2/h;

    .line 85
    .line 86
    invoke-virtual {p1}, LU2/h;->c()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-le p1, v1, :cond_3

    .line 91
    .line 92
    invoke-interface {p2}, LU2/q;->getPosition()J

    .line 93
    .line 94
    .line 95
    move-result-wide p1

    .line 96
    iput-wide p1, p0, Lo3/h;->O:J

    .line 97
    .line 98
    return-void

    .line 99
    :cond_2
    const p2, 0x656d7367

    .line 100
    .line 101
    .line 102
    if-ne v0, p2, :cond_3

    .line 103
    .line 104
    iget-object p1, p1, Lu2/e$c;->b:Lt2/I;

    .line 105
    .line 106
    invoke-direct {p0, p1}, Lo3/h;->w(Lt2/I;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    return-void
.end method

.method private y(Lu2/e$b;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget-object v1, p0, Lo3/h;->c:Lo3/t;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    iget v3, p0, Lo3/h;->b:I

    .line 12
    .line 13
    iget-object v4, p0, Lo3/h;->i:[B

    .line 14
    .line 15
    invoke-static {p1, v0, v1, v3, v4}, Lo3/h;->C(Lu2/e$b;Landroid/util/SparseArray;ZI[B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lu2/e$b;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {p1}, Lo3/h;->o(Ljava/util/List;)Lq2/q;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    move v1, v2

    .line 33
    :goto_1
    if-ge v1, v0, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lo3/h$b;

    .line 42
    .line 43
    invoke-virtual {v3, p1}, Lo3/h$b;->n(Lq2/q;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-wide v0, p0, Lo3/h;->A:J

    .line 50
    .line 51
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    cmp-long p1, v0, v3

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_2
    if-ge v2, p1, :cond_2

    .line 67
    .line 68
    iget-object v0, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Lo3/h$b;

    .line 75
    .line 76
    iget-wide v5, p0, Lo3/h;->A:J

    .line 77
    .line 78
    invoke-virtual {v0, v5, v6}, Lo3/h$b;->l(J)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iput-wide v3, p0, Lo3/h;->A:J

    .line 85
    .line 86
    :cond_3
    return-void
.end method

.method private z(Lu2/e$b;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lo3/h;->c:Lo3/t;

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    const/4 v10, 0x1

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    move v2, v10

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v9

    .line 14
    :goto_0
    const-string v3, "Unexpected moov box."

    .line 15
    .line 16
    invoke-static {v2, v3}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lu2/e$b;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v2}, Lo3/h;->o(Ljava/util/List;)Lq2/q;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const v2, 0x6d766578

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lu2/e$b;

    .line 37
    .line 38
    new-instance v11, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v3, v2, Lu2/e$b;->c:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    move v4, v9

    .line 55
    :goto_1
    if-ge v4, v3, :cond_3

    .line 56
    .line 57
    iget-object v8, v2, Lu2/e$b;->c:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, Lu2/e$c;

    .line 64
    .line 65
    iget v12, v8, Lu2/e;->a:I

    .line 66
    .line 67
    const v13, 0x74726578

    .line 68
    .line 69
    .line 70
    if-ne v12, v13, :cond_1

    .line 71
    .line 72
    iget-object v8, v8, Lu2/e$c;->b:Lt2/I;

    .line 73
    .line 74
    invoke-static {v8}, Lo3/h;->M(Lt2/I;)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iget-object v12, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v12, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v8, Lo3/c;

    .line 89
    .line 90
    invoke-virtual {v11, v12, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_1
    const v13, 0x6d656864

    .line 95
    .line 96
    .line 97
    if-ne v12, v13, :cond_2

    .line 98
    .line 99
    iget-object v6, v8, Lu2/e$c;->b:Lt2/I;

    .line 100
    .line 101
    invoke-static {v6}, Lo3/h;->B(Lt2/I;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    const v2, 0x6d657461

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const/4 v3, 0x0

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-static {v2}, Lo3/b;->u(Lu2/e$b;)Lq2/J;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v12, v2

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    move-object v12, v3

    .line 125
    :goto_3
    new-instance v2, LU2/B;

    .line 126
    .line 127
    invoke-direct {v2}, LU2/B;-><init>()V

    .line 128
    .line 129
    .line 130
    const v4, 0x75647461

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v4}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-static {v4}, Lo3/b;->I(Lu2/e$c;)Lq2/J;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v2, v3}, LU2/B;->c(Lq2/J;)Z

    .line 144
    .line 145
    .line 146
    :cond_5
    move-object v13, v3

    .line 147
    new-instance v14, Lq2/J;

    .line 148
    .line 149
    const v3, 0x6d766864

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lu2/e$c;

    .line 161
    .line 162
    iget-object v3, v3, Lu2/e$c;->b:Lt2/I;

    .line 163
    .line 164
    invoke-static {v3}, Lo3/b;->w(Lt2/I;)Lu2/g;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-array v4, v10, [Lq2/J$a;

    .line 169
    .line 170
    aput-object v3, v4, v9

    .line 171
    .line 172
    invoke-direct {v14, v4}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 173
    .line 174
    .line 175
    iget v3, v0, Lo3/h;->b:I

    .line 176
    .line 177
    and-int/lit8 v3, v3, 0x10

    .line 178
    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    move-wide v3, v6

    .line 182
    move v6, v10

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move-wide v3, v6

    .line 185
    move v6, v9

    .line 186
    :goto_4
    new-instance v8, Lo3/e;

    .line 187
    .line 188
    invoke-direct {v8, v0}, Lo3/e;-><init>(Lo3/h;)V

    .line 189
    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    invoke-static/range {v1 .. v8}, Lo3/b;->H(Lu2/e$b;LU2/B;JLq2/q;ZZLO9/f;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    iget-object v4, v0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 201
    .line 202
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_8

    .line 207
    .line 208
    invoke-static {v1}, Lo3/k;->a(Ljava/util/List;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    :goto_5
    if-ge v9, v3, :cond_7

    .line 213
    .line 214
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Lo3/w;

    .line 219
    .line 220
    iget-object v6, v5, Lo3/w;->a:Lo3/t;

    .line 221
    .line 222
    iget-object v7, v0, Lo3/h;->J:LU2/r;

    .line 223
    .line 224
    iget v8, v6, Lo3/t;->b:I

    .line 225
    .line 226
    invoke-interface {v7, v9, v8}, LU2/r;->e(II)LU2/O;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    move v10, v9

    .line 231
    iget-wide v8, v6, Lo3/t;->e:J

    .line 232
    .line 233
    invoke-interface {v7, v8, v9}, LU2/O;->d(J)V

    .line 234
    .line 235
    .line 236
    iget-object v8, v6, Lo3/t;->g:Lq2/x;

    .line 237
    .line 238
    invoke-virtual {v8}, Lq2/x;->b()Lq2/x$b;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-virtual {v8, v4}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 243
    .line 244
    .line 245
    iget v9, v6, Lo3/t;->b:I

    .line 246
    .line 247
    invoke-static {v9, v2, v8}, Lo3/j;->l(ILU2/B;Lq2/x$b;)V

    .line 248
    .line 249
    .line 250
    iget v9, v6, Lo3/t;->b:I

    .line 251
    .line 252
    iget-object v15, v6, Lo3/t;->g:Lq2/x;

    .line 253
    .line 254
    iget-object v15, v15, Lq2/x;->l:Lq2/J;

    .line 255
    .line 256
    move-object/from16 p1, v2

    .line 257
    .line 258
    filled-new-array {v13, v14}, [Lq2/J;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-static {v9, v12, v8, v15, v2}, Lo3/j;->m(ILq2/J;Lq2/x$b;Lq2/J;[Lq2/J;)V

    .line 263
    .line 264
    .line 265
    new-instance v2, Lo3/h$b;

    .line 266
    .line 267
    iget v9, v6, Lo3/t;->a:I

    .line 268
    .line 269
    invoke-direct {v0, v11, v9}, Lo3/h;->n(Landroid/util/SparseArray;I)Lo3/c;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    invoke-virtual {v8}, Lq2/x$b;->P()Lq2/x;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    invoke-direct {v2, v7, v5, v9, v8}, Lo3/h$b;-><init>(LU2/O;Lo3/w;Lo3/c;Lq2/x;)V

    .line 278
    .line 279
    .line 280
    iget-object v5, v0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 281
    .line 282
    iget v7, v6, Lo3/t;->a:I

    .line 283
    .line 284
    invoke-virtual {v5, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-wide v7, v0, Lo3/h;->B:J

    .line 288
    .line 289
    iget-wide v5, v6, Lo3/t;->e:J

    .line 290
    .line 291
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 292
    .line 293
    .line 294
    move-result-wide v5

    .line 295
    iput-wide v5, v0, Lo3/h;->B:J

    .line 296
    .line 297
    add-int/lit8 v9, v10, 0x1

    .line 298
    .line 299
    move-object/from16 v2, p1

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_7
    iget-object v1, v0, Lo3/h;->J:LU2/r;

    .line 303
    .line 304
    invoke-interface {v1}, LU2/r;->p()V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_8
    iget-object v2, v0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-ne v2, v3, :cond_9

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_9
    move v10, v9

    .line 318
    :goto_6
    invoke-static {v10}, Lt2/a;->g(Z)V

    .line 319
    .line 320
    .line 321
    :goto_7
    if-ge v9, v3, :cond_a

    .line 322
    .line 323
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    check-cast v2, Lo3/w;

    .line 328
    .line 329
    iget-object v4, v2, Lo3/w;->a:Lo3/t;

    .line 330
    .line 331
    iget-object v5, v0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 332
    .line 333
    iget v6, v4, Lo3/t;->a:I

    .line 334
    .line 335
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    check-cast v5, Lo3/h$b;

    .line 340
    .line 341
    iget v4, v4, Lo3/t;->a:I

    .line 342
    .line 343
    invoke-direct {v0, v11, v4}, Lo3/h;->n(Landroid/util/SparseArray;I)Lo3/c;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {v5, v2, v4}, Lo3/h$b;->j(Lo3/w;Lo3/c;)V

    .line 348
    .line 349
    .line 350
    add-int/lit8 v9, v9, 0x1

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_a
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(JJ)V
    .locals 2

    .line 1
    iget-object p1, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    move v0, p2

    .line 9
    :goto_0
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lo3/h$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lo3/h$b;->k()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Lo3/h;->o:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 28
    .line 29
    .line 30
    iput p2, p0, Lo3/h;->z:I

    .line 31
    .line 32
    iget-object p1, p0, Lo3/h;->p:Lu2/k;

    .line 33
    .line 34
    invoke-virtual {p1}, Lu2/k;->b()V

    .line 35
    .line 36
    .line 37
    iput-wide p3, p0, Lo3/h;->A:J

    .line 38
    .line 39
    iget-object p1, p0, Lo3/h;->n:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lo3/h;->m()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public c(LU2/r;)V
    .locals 13

    .line 1
    iget v0, p0, Lo3/h;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lr3/s;

    .line 8
    .line 9
    iget-object v1, p0, Lo3/h;->a:Lr3/r$a;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lr3/s;-><init>(LU2/r;Lr3/r$a;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, Lo3/h;->J:LU2/r;

    .line 16
    .line 17
    invoke-direct {p0}, Lo3/h;->m()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lo3/h;->r()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lo3/h;->c:Lo3/t;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p1, Lo3/t;->g:Lq2/x;

    .line 28
    .line 29
    invoke-virtual {p1}, Lq2/x;->b()Lq2/x$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lo3/h;->c:Lo3/t;

    .line 34
    .line 35
    iget-object v0, v0, Lo3/t;->g:Lq2/x;

    .line 36
    .line 37
    invoke-static {v0}, Lo3/k;->b(Lq2/x;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 42
    .line 43
    .line 44
    new-instance v0, Lo3/h$b;

    .line 45
    .line 46
    iget-object v1, p0, Lo3/h;->J:LU2/r;

    .line 47
    .line 48
    iget-object v2, p0, Lo3/h;->c:Lo3/t;

    .line 49
    .line 50
    iget v2, v2, Lo3/t;->b:I

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-interface {v1, v3, v2}, LU2/r;->e(II)LU2/O;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v4, Lo3/w;

    .line 58
    .line 59
    iget-object v5, p0, Lo3/h;->c:Lo3/t;

    .line 60
    .line 61
    new-array v6, v3, [J

    .line 62
    .line 63
    new-array v7, v3, [I

    .line 64
    .line 65
    new-array v9, v3, [J

    .line 66
    .line 67
    new-array v10, v3, [I

    .line 68
    .line 69
    const-wide/16 v11, 0x0

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-direct/range {v4 .. v12}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lo3/c;

    .line 76
    .line 77
    invoke-direct {v2, v3, v3, v3, v3}, Lo3/c;-><init>(IIII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lq2/x$b;->P()Lq2/x;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {v0, v1, v4, v2, p1}, Lo3/h$b;-><init>(LU2/O;Lo3/w;Lo3/c;Lq2/x;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lo3/h;->e:Landroid/util/SparseArray;

    .line 88
    .line 89
    invoke-virtual {p1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lo3/h;->J:LU2/r;

    .line 93
    .line 94
    invoke-interface {p1}, LU2/r;->p()V

    .line 95
    .line 96
    .line 97
    :cond_1
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lo3/s;->b(LU2/q;)LU2/N;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iput-object v0, p0, Lo3/h;->s:LP9/u;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 6

    .line 1
    :cond_0
    :goto_0
    iget v0, p0, Lo3/h;->t:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lo3/h;->U(LU2/q;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    invoke-direct {p0, p1}, Lo3/h;->T(LU2/q;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    invoke-direct {p0, p1}, Lo3/h;->S(LU2/q;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    invoke-direct {p0, p1}, Lo3/h;->R(LU2/q;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-wide v2, p0, Lo3/h;->O:J

    .line 34
    .line 35
    const-wide/16 v4, -0x1

    .line 36
    .line 37
    cmp-long p1, v2, v4

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iput-wide v2, p2, LU2/I;->a:J

    .line 42
    .line 43
    iput-wide v4, p0, Lo3/h;->O:J

    .line 44
    .line 45
    iget-object p1, p0, Lo3/h;->J:LU2/r;

    .line 46
    .line 47
    iget-object p2, p0, Lo3/h;->r:LU2/h;

    .line 48
    .line 49
    invoke-virtual {p2}, LU2/h;->b()LU2/g;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p1, p2}, LU2/r;->t(LU2/J;)V

    .line 54
    .line 55
    .line 56
    iput-boolean v1, p0, Lo3/h;->N:Z

    .line 57
    .line 58
    return v1

    .line 59
    :cond_4
    iget-object p1, p0, Lo3/h;->p:Lu2/k;

    .line 60
    .line 61
    invoke-virtual {p1}, Lu2/k;->d()V

    .line 62
    .line 63
    .line 64
    const/4 p1, -0x1

    .line 65
    return p1
.end method

.method public bridge synthetic l()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo3/h;->q()LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q()LP9/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lo3/h;->s:LP9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method protected u(Lo3/t;)Lo3/t;
    .locals 0

    .line 1
    return-object p1
.end method
