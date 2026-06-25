.class public abstract Lta/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lta/b$b;
    }
.end annotation


# static fields
.field private static final a:Lta/a;

.field private static volatile b:Lta/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lta/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lta/b$b;-><init>(Lta/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lta/b;->a:Lta/a;

    .line 8
    .line 9
    sput-object v0, Lta/b;->b:Lta/a;

    .line 10
    .line 11
    return-void
.end method

.method public static a()Lta/a;
    .locals 1

    .line 1
    sget-object v0, Lta/b;->b:Lta/a;

    .line 2
    .line 3
    return-object v0
.end method
