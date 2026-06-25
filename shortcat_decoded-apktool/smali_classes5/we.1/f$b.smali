.class public final Lwe/f$b;
.super Lwe/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final f:Lwe/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwe/f$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lwe/f$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwe/f$b;->f:Lwe/f$b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    sget-object v1, Lve/o;->x:LXe/c;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const-string v2, "KFunction"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v5}, Lwe/f;-><init>(LXe/c;Ljava/lang/String;ZLXe/b;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
