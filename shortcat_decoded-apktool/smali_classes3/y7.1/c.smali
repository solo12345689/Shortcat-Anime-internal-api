.class public final Ly7/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/c$a;,
        Ly7/c$b;
    }
.end annotation


# static fields
.field public static final a:Ly7/c;

.field public static final b:Ljava/util/concurrent/Executor;

.field public static final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly7/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ly7/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly7/c;->a:Ly7/c;

    .line 7
    .line 8
    new-instance v0, Ly7/c$b;

    .line 9
    .line 10
    invoke-direct {v0}, Ly7/c$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly7/c;->b:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v0, Ly7/c$a;

    .line 16
    .line 17
    invoke-direct {v0}, Ly7/c$a;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ly7/c;->c:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
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
