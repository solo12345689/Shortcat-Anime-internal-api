.class public interface abstract Lpf/f$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpf/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:Lpf/f$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpf/f$f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lpf/f$f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpf/f$f;->a:Lpf/f$f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
.end method
