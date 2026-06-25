.class public interface abstract Ldg/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/n$a;
    }
.end annotation


# static fields
.field public static final a:Ldg/n$a;

.field public static final b:Ldg/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ldg/n$a;->a:Ldg/n$a;

    .line 2
    .line 3
    sput-object v0, Ldg/n;->a:Ldg/n$a;

    .line 4
    .line 5
    new-instance v0, Ldg/n$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Ldg/n$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldg/n;->b:Ldg/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract b(Ldg/u;)Ljava/util/List;
.end method

.method public abstract d(Ldg/u;Ljava/util/List;)V
.end method
