.class public interface abstract Li4/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/l$b;
    }
.end annotation


# static fields
.field public static final a:Li4/l$b$c;

.field public static final b:Li4/l$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li4/l$b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li4/l$b$c;-><init>(Li4/l$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li4/l;->a:Li4/l$b$c;

    .line 8
    .line 9
    new-instance v0, Li4/l$b$b;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Li4/l$b$b;-><init>(Li4/l$a;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Li4/l;->b:Li4/l$b$b;

    .line 15
    .line 16
    return-void
.end method
