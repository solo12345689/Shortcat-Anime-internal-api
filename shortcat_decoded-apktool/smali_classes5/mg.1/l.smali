.class public interface abstract Lmg/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmg/l$a;
    }
.end annotation


# static fields
.field public static final a:Lmg/l$a;

.field public static final b:Lmg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lmg/l$a;->a:Lmg/l$a;

    .line 2
    .line 3
    sput-object v0, Lmg/l;->a:Lmg/l$a;

    .line 4
    .line 5
    new-instance v0, Lmg/l$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lmg/l$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lmg/l;->b:Lmg/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(ILmg/b;)V
.end method

.method public abstract b(ILjava/util/List;)Z
.end method

.method public abstract c(ILjava/util/List;Z)Z
.end method

.method public abstract d(ILtg/j;IZ)Z
.end method
