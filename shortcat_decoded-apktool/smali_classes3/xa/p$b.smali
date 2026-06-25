.class public Lxa/p$b;
.super Lxa/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# instance fields
.field private final b:Lxa/p;


# direct methods
.method public constructor <init>(Lxa/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxa/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa/p$b;->b:Lxa/p;

    .line 5
    .line 6
    return-void
.end method
