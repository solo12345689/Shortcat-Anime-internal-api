.class public final Lexpo/modules/updates/b$g;
.super Lexpo/modules/kotlin/exception/CodedException;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/b;->e(LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "Cannot relaunch without a launched update."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "ERR_UPDATES_RELOAD"

    .line 5
    .line 6
    invoke-direct {p0, v2, v0, v1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
