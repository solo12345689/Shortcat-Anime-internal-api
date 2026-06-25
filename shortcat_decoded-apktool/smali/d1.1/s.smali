.class public abstract Ld1/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ld1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld1/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld1/t;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld1/s;->a:Ld1/t;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a()Ld1/t;
    .locals 1

    .line 1
    sget-object v0, Ld1/s;->a:Ld1/t;

    .line 2
    .line 3
    return-object v0
.end method
