.class public LP2/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LP2/A$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:F

.field private final g:F

.field private final h:Lt2/j;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x61a8

    const v1, 0x3f333333    # 0.7f

    const/16 v2, 0x2710

    .line 1
    invoke-direct {p0, v2, v0, v0, v1}, LP2/a$b;-><init>(IIIF)V

    return-void
.end method

.method public constructor <init>(IIIF)V
    .locals 9

    const/high16 v7, 0x3f400000    # 0.75f

    .line 2
    sget-object v8, Lt2/j;->a:Lt2/j;

    const/16 v4, 0x4ff

    const/16 v5, 0x2cf

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v6, p4

    invoke-direct/range {v0 .. v8}, LP2/a$b;-><init>(IIIIIFFLt2/j;)V

    return-void
.end method

.method public constructor <init>(IIIIIFFLt2/j;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, LP2/a$b;->a:I

    .line 5
    iput p2, p0, LP2/a$b;->b:I

    .line 6
    iput p3, p0, LP2/a$b;->c:I

    .line 7
    iput p4, p0, LP2/a$b;->d:I

    .line 8
    iput p5, p0, LP2/a$b;->e:I

    .line 9
    iput p6, p0, LP2/a$b;->f:F

    .line 10
    iput p7, p0, LP2/a$b;->g:F

    .line 11
    iput-object p8, p0, LP2/a$b;->h:Lt2/j;

    return-void
.end method


# virtual methods
.method public final a([LP2/A$a;LQ2/d;LM2/D$b;Lq2/Y;)[LP2/A;
    .locals 9

    .line 1
    invoke-static {p1}, LP2/a;->u([LP2/A$a;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    array-length p4, p1

    .line 6
    new-array p4, p4, [LP2/A;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    array-length v2, p1

    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    aget-object v2, p1, v1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, LP2/A$a;->b:[I

    .line 18
    .line 19
    array-length v3, v5

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :cond_0
    move-object v7, p2

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    array-length v3, v5

    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne v3, v4, :cond_2

    .line 27
    .line 28
    new-instance v3, LP2/B;

    .line 29
    .line 30
    iget-object v4, v2, LP2/A$a;->a:Lq2/a0;

    .line 31
    .line 32
    aget v5, v5, v0

    .line 33
    .line 34
    iget v2, v2, LP2/A$a;->c:I

    .line 35
    .line 36
    invoke-direct {v3, v4, v5, v2}, LP2/B;-><init>(Lq2/a0;II)V

    .line 37
    .line 38
    .line 39
    move-object v7, p2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v4, v2, LP2/A$a;->a:Lq2/a0;

    .line 42
    .line 43
    iget v6, v2, LP2/A$a;->c:I

    .line 44
    .line 45
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move-object v8, v2

    .line 50
    check-cast v8, LP9/u;

    .line 51
    .line 52
    move-object v3, p0

    .line 53
    move-object v7, p2

    .line 54
    invoke-virtual/range {v3 .. v8}, LP2/a$b;->b(Lq2/a0;[IILQ2/d;LP9/u;)LP2/a;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    move-object v3, p2

    .line 59
    :goto_1
    aput-object v3, p4, v1

    .line 60
    .line 61
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    move-object p2, v7

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-object p4
.end method

.method protected b(Lq2/a0;[IILQ2/d;LP9/u;)LP2/a;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LP2/a;

    .line 4
    .line 5
    iget v2, v0, LP2/a$b;->a:I

    .line 6
    .line 7
    int-to-long v6, v2

    .line 8
    iget v2, v0, LP2/a$b;->b:I

    .line 9
    .line 10
    int-to-long v8, v2

    .line 11
    iget v2, v0, LP2/a$b;->c:I

    .line 12
    .line 13
    int-to-long v10, v2

    .line 14
    iget v12, v0, LP2/a$b;->d:I

    .line 15
    .line 16
    iget v13, v0, LP2/a$b;->e:I

    .line 17
    .line 18
    iget v14, v0, LP2/a$b;->f:F

    .line 19
    .line 20
    iget v15, v0, LP2/a$b;->g:F

    .line 21
    .line 22
    iget-object v2, v0, LP2/a$b;->h:Lt2/j;

    .line 23
    .line 24
    move-object/from16 v3, p2

    .line 25
    .line 26
    move/from16 v4, p3

    .line 27
    .line 28
    move-object/from16 v5, p4

    .line 29
    .line 30
    move-object/from16 v16, p5

    .line 31
    .line 32
    move-object/from16 v17, v2

    .line 33
    .line 34
    move-object/from16 v2, p1

    .line 35
    .line 36
    invoke-direct/range {v1 .. v17}, LP2/a;-><init>(Lq2/a0;[IILQ2/d;JJJIIFFLjava/util/List;Lt2/j;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method
