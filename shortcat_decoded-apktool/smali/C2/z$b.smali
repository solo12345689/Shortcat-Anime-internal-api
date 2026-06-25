.class public final LC2/z$b;
.super Ljava/lang/Exception;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lq2/x;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lq2/x;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, LC2/z$b;->a:Lq2/x;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lq2/x;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, LC2/z$b;->a:Lq2/x;

    return-void
.end method
