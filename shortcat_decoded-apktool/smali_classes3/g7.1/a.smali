.class public final Lg7/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lg7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/a$a;
    }
.end annotation


# static fields
.field public static final a:Lg7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lg7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/a;->a:Lg7/a;

    .line 7
    .line 8
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

.method public static final b()Lg7/a;
    .locals 1

    .line 1
    sget-object v0, Lg7/a;->a:Lg7/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()Lg7/b$a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg7/a$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lg7/a$a;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
