.class public Lqa/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lqa/a;


# static fields
.field private static a:Lqa/b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()Lqa/b;
    .locals 1

    .line 1
    sget-object v0, Lqa/b;->a:Lqa/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lqa/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lqa/b;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lqa/b;->a:Lqa/b;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lqa/b;->a:Lqa/b;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method
