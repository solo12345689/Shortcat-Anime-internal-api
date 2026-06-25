.class public LF5/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF5/a;


# static fields
.field private static final a:LF5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF5/d;

    .line 2
    .line 3
    invoke-direct {v0}, LF5/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF5/d;->a:LF5/d;

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

.method public static a()LF5/d;
    .locals 1

    .line 1
    sget-object v0, LF5/d;->a:LF5/d;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public now()J
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
