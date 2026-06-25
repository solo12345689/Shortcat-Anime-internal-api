.class public final LU/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LU/J;

.field private static final b:F

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:Lw/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LU/J;

    .line 2
    .line 3
    invoke-direct {v0}, LU/J;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/J;->a:LU/J;

    .line 7
    .line 8
    sget-object v0, LX/k;->a:LX/k;

    .line 9
    .line 10
    invoke-virtual {v0}, LX/k;->e()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sput v1, LU/J;->b:F

    .line 15
    .line 16
    sget-object v1, Ls0/G1;->a:Ls0/G1$a;

    .line 17
    .line 18
    invoke-virtual {v1}, Ls0/G1$a;->b()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sput v2, LU/J;->c:I

    .line 23
    .line 24
    invoke-virtual {v1}, Ls0/G1$a;->b()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sput v2, LU/J;->d:I

    .line 29
    .line 30
    invoke-virtual {v1}, Ls0/G1$a;->b()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sput v1, LU/J;->e:I

    .line 35
    .line 36
    invoke-virtual {v0}, LX/k;->d()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    sput v1, LU/J;->f:F

    .line 41
    .line 42
    invoke-virtual {v0}, LX/k;->b()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sput v1, LU/J;->g:F

    .line 47
    .line 48
    invoke-virtual {v0}, LX/k;->b()F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    sput v0, LU/J;->h:F

    .line 53
    .line 54
    new-instance v0, Lw/h0;

    .line 55
    .line 56
    const v1, 0x3a83126f    # 0.001f

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/high16 v2, 0x3f800000    # 1.0f

    .line 64
    .line 65
    const/high16 v3, 0x42480000    # 50.0f

    .line 66
    .line 67
    invoke-direct {v0, v2, v3, v1}, Lw/h0;-><init>(FFLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sput-object v0, LU/J;->i:Lw/h0;

    .line 71
    .line 72
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LY/m;I)J
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)"

    .line 9
    .line 10
    const v2, 0x6b7ceedd

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, LX/k;->a:LX/k;

    .line 17
    .line 18
    invoke-virtual {p2}, LX/k;->a()LX/c;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {p2, p1, v0}, LU/m;->h(LX/c;LY/m;I)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-wide p1
.end method

.method public final b()I
    .locals 1

    .line 1
    sget v0, LU/J;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final c(LY/m;I)J
    .locals 2

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    const-string v0, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)"

    .line 9
    .line 10
    const v1, -0x741a9cc3

    .line 11
    .line 12
    .line 13
    invoke-static {v1, p2, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p1, Ls0/r0;->b:Ls0/r0$a;

    .line 17
    .line 18
    invoke-virtual {p1}, Ls0/r0$a;->i()J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-static {}, LY/w;->L()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {}, LY/w;->T()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-wide p1
.end method

.method public final d()F
    .locals 1

    .line 1
    sget v0, LU/J;->b:F

    .line 2
    .line 3
    return v0
.end method
