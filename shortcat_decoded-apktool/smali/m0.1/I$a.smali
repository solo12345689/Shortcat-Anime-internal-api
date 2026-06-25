.class public final Lm0/I$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lm0/I$a;

.field private static final b:Lm0/I;

.field private static final c:Lm0/I;

.field private static final d:Lm0/I;

.field private static final e:Lm0/I;

.field private static final f:Lm0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/I$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm0/I$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm0/I$a;->a:Lm0/I$a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Lm0/J;->a(I)Lm0/I;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lm0/I$a;->b:Lm0/I;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-static {v0}, Lm0/J;->a(I)Lm0/I;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lm0/I$a;->c:Lm0/I;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-static {v0}, Lm0/J;->a(I)Lm0/I;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lm0/I$a;->d:Lm0/I;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {v0}, Lm0/J;->a(I)Lm0/I;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lm0/I$a;->e:Lm0/I;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-static {v0}, Lm0/J;->a(I)Lm0/I;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lm0/I$a;->f:Lm0/I;

    .line 42
    .line 43
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
.method public final a()Lm0/I;
    .locals 1

    .line 1
    sget-object v0, Lm0/I$a;->c:Lm0/I;

    .line 2
    .line 3
    return-object v0
.end method
