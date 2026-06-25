.class public final LI0/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LI0/f$a;

.field private static final b:LI0/f;

.field private static final c:LI0/f;

.field private static final d:LI0/f;

.field private static final e:LI0/f;

.field private static final f:LI0/f;

.field private static final g:LI0/i;

.field private static final h:LI0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI0/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, LI0/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LI0/f$a;->a:LI0/f$a;

    .line 7
    .line 8
    new-instance v0, LI0/f$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, LI0/f$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LI0/f$a;->b:LI0/f;

    .line 14
    .line 15
    new-instance v0, LI0/f$a$e;

    .line 16
    .line 17
    invoke-direct {v0}, LI0/f$a$e;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LI0/f$a;->c:LI0/f;

    .line 21
    .line 22
    new-instance v0, LI0/f$a$c;

    .line 23
    .line 24
    invoke-direct {v0}, LI0/f$a$c;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LI0/f$a;->d:LI0/f;

    .line 28
    .line 29
    new-instance v0, LI0/f$a$d;

    .line 30
    .line 31
    invoke-direct {v0}, LI0/f$a$d;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, LI0/f$a;->e:LI0/f;

    .line 35
    .line 36
    new-instance v0, LI0/f$a$f;

    .line 37
    .line 38
    invoke-direct {v0}, LI0/f$a$f;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, LI0/f$a;->f:LI0/f;

    .line 42
    .line 43
    new-instance v0, LI0/i;

    .line 44
    .line 45
    const/high16 v1, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-direct {v0, v1}, LI0/i;-><init>(F)V

    .line 48
    .line 49
    .line 50
    sput-object v0, LI0/f$a;->g:LI0/i;

    .line 51
    .line 52
    new-instance v0, LI0/f$a$b;

    .line 53
    .line 54
    invoke-direct {v0}, LI0/f$a$b;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, LI0/f$a;->h:LI0/f;

    .line 58
    .line 59
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
.method public final a()LI0/f;
    .locals 1

    .line 1
    sget-object v0, LI0/f$a;->b:LI0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LI0/f;
    .locals 1

    .line 1
    sget-object v0, LI0/f$a;->c:LI0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LI0/f;
    .locals 1

    .line 1
    sget-object v0, LI0/f$a;->f:LI0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LI0/i;
    .locals 1

    .line 1
    sget-object v0, LI0/f$a;->g:LI0/i;

    .line 2
    .line 3
    return-object v0
.end method
