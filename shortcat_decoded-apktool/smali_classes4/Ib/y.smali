.class public final LIb/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LIb/y;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LIb/y;

    .line 2
    .line 3
    invoke-direct {v0}, LIb/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIb/y;->a:LIb/y;

    .line 7
    .line 8
    const-string v0, "ExpoImage"

    .line 9
    .line 10
    sput-object v0, LIb/y;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "load new image"

    .line 13
    .line 14
    sput-object v0, LIb/y;->c:Ljava/lang/String;

    .line 15
    .line 16
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
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LIb/y;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LIb/y;->d:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x1

    .line 5
    .line 6
    sput v1, LIb/y;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    monitor-exit p0

    .line 12
    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LIb/y;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
