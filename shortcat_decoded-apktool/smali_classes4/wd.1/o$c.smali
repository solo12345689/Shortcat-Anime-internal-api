.class public abstract Lwd/o$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/o$c$a;,
        Lwd/o$c$b;,
        Lwd/o$c$c;,
        Lwd/o$c$d;
    }
.end annotation


# instance fields
.field private final a:Lwd/o$c$c;


# direct methods
.method private constructor <init>(Lwd/o$c$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/o$c;->a:Lwd/o$c$c;

    return-void
.end method

.method public synthetic constructor <init>(Lwd/o$c$c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwd/o$c;-><init>(Lwd/o$c$c;)V

    return-void
.end method
