.class public abstract LY0/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/u$a;,
        LY0/u$b;
    }
.end annotation


# static fields
.field public static final b:LY0/u$a;

.field private static final c:LY0/g0;

.field private static final d:LY0/P;

.field private static final e:LY0/P;

.field private static final f:LY0/P;

.field private static final g:LY0/P;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LY0/u$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY0/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY0/u;->b:LY0/u$a;

    .line 8
    .line 9
    new-instance v0, LY0/o;

    .line 10
    .line 11
    invoke-direct {v0}, LY0/o;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY0/u;->c:LY0/g0;

    .line 15
    .line 16
    new-instance v0, LY0/P;

    .line 17
    .line 18
    const-string v1, "sans-serif"

    .line 19
    .line 20
    const-string v2, "FontFamily.SansSerif"

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, LY0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, LY0/u;->d:LY0/P;

    .line 26
    .line 27
    new-instance v0, LY0/P;

    .line 28
    .line 29
    const-string v1, "serif"

    .line 30
    .line 31
    const-string v2, "FontFamily.Serif"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, LY0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, LY0/u;->e:LY0/P;

    .line 37
    .line 38
    new-instance v0, LY0/P;

    .line 39
    .line 40
    const-string v1, "monospace"

    .line 41
    .line 42
    const-string v2, "FontFamily.Monospace"

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, LY0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LY0/u;->f:LY0/P;

    .line 48
    .line 49
    new-instance v0, LY0/P;

    .line 50
    .line 51
    const-string v1, "cursive"

    .line 52
    .line 53
    const-string v2, "FontFamily.Cursive"

    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, LY0/P;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, LY0/u;->g:LY0/P;

    .line 59
    .line 60
    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LY0/u;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY0/u;-><init>(Z)V

    return-void
.end method

.method public static final synthetic b()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LY0/u;->g:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()LY0/g0;
    .locals 1

    .line 1
    sget-object v0, LY0/u;->c:LY0/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LY0/u;->f:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LY0/u;->d:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic i()LY0/P;
    .locals 1

    .line 1
    sget-object v0, LY0/u;->e:LY0/P;

    .line 2
    .line 3
    return-object v0
.end method
