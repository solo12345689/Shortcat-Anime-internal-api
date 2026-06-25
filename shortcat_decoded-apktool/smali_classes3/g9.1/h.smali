.class public abstract Lg9/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lg9/e;

.field private static volatile b:Lg9/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg9/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg9/g;-><init>(Lg9/f;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg9/h;->a:Lg9/e;

    .line 8
    .line 9
    sput-object v0, Lg9/h;->b:Lg9/e;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Lg9/e;
    .locals 1

    .line 1
    sget-object v0, Lg9/h;->b:Lg9/e;

    .line 2
    .line 3
    return-object v0
.end method
