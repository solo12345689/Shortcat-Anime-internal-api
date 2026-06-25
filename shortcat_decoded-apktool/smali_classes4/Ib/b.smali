.class public final LIb/b;
.super LIb/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIb/b$a;
    }
.end annotation


# instance fields
.field private final j:LIb/o;

.field private final k:Lexpo/modules/image/enums/ContentFit;

.field private l:Z


# direct methods
.method public constructor <init>(LIb/o;Lexpo/modules/image/enums/ContentFit;)V
    .locals 1

    .line 1
    const-string v0, "target"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentFit"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LIb/c;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LIb/b;->j:LIb/o;

    .line 15
    .line 16
    iput-object p2, p0, LIb/b;->k:Lexpo/modules/image/enums/ContentFit;

    .line 17
    .line 18
    return-void
.end method

.method private final c(FFFF)F
    .locals 3

    .line 1
    iget-object v0, p0, LIb/b;->k:Lexpo/modules/image/enums/ContentFit;

    .line 2
    .line 3
    sget-object v1, LIb/b$a;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_3

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    const/high16 v2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    cmpg-float v0, p3, p1

    .line 24
    .line 25
    if-ltz v0, :cond_2

    .line 26
    .line 27
    cmpg-float v0, p4, p2

    .line 28
    .line 29
    if-gez v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return v2

    .line 33
    :cond_2
    :goto_0
    div-float/2addr p3, p1

    .line 34
    div-float/2addr p4, p2

    .line 35
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_3
    div-float/2addr p3, p1

    .line 41
    div-float/2addr p4, p2

    .line 42
    invoke-static {p3, p4}, Ljava/lang/Float;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_4
    div-float/2addr p3, p1

    .line 48
    div-float/2addr p4, p2

    .line 49
    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1
.end method


# virtual methods
.method public a(IIII)Lb5/n$g;
    .locals 0

    .line 1
    sget-object p1, Lb5/n$g;->b:Lb5/n$g;

    .line 2
    .line 3
    return-object p1
.end method

.method public b(IIII)F
    .locals 2

    .line 1
    iget-boolean v0, p0, LIb/b;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LIb/b;->j:LIb/o;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LIb/o;->B(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LIb/b;->j:LIb/o;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, LIb/o;->A(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LIb/b;->l:Z

    .line 17
    .line 18
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/high16 v1, -0x80000000

    .line 21
    .line 22
    if-eq p3, v1, :cond_2

    .line 23
    .line 24
    if-ne p4, v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    int-to-float p1, p1

    .line 28
    int-to-float p2, p2

    .line 29
    int-to-float p3, p3

    .line 30
    int-to-float p4, p4

    .line 31
    invoke-direct {p0, p1, p2, p3, p4}, LIb/b;->c(FFFF)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_2
    :goto_0
    return v0
.end method
