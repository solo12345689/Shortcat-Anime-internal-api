.class public final LY/I$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LY/I$a;

.field private static final b:LY/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY/I$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY/I$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY/I$a;->a:LY/I$a;

    .line 7
    .line 8
    invoke-static {}, Lg0/n;->a()Lg0/m;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, LY/I$a;->b:LY/I;

    .line 13
    .line 14
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
.method public final a()LY/I;
    .locals 1

    .line 1
    sget-object v0, LY/I$a;->b:LY/I;

    .line 2
    .line 3
    return-object v0
.end method
