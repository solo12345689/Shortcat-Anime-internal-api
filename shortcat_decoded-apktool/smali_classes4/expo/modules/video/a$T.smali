.class public final Lexpo/modules/video/a$T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/video/a$T;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/a$T;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/video/a$T;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/video/a$T;->a:Lexpo/modules/video/a$T;

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


# virtual methods
.method public final a()Lpe/q;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/video/VideoThumbnail;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/O;->o(Ljava/lang/Class;)Lpe/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/video/a$T;->a()Lpe/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
