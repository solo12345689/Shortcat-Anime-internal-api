.class public LY4/w$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:LY4/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY4/w$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY4/w$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY4/w$a;->a:LY4/w$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LY4/w$a;
    .locals 1

    .line 1
    sget-object v0, LY4/w$a;->a:LY4/w$a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public d(LY4/r;)LY4/n;
    .locals 0

    .line 1
    invoke-static {}, LY4/w;->c()LY4/w;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
