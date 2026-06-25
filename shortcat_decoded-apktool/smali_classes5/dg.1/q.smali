.class public interface abstract Ldg/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/q$a;
    }
.end annotation


# static fields
.field public static final a:Ldg/q$a;

.field public static final b:Ldg/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ldg/q$a;->a:Ldg/q$a;

    .line 2
    .line 3
    sput-object v0, Ldg/q;->a:Ldg/q$a;

    .line 4
    .line 5
    new-instance v0, Ldg/q$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Ldg/q$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldg/q;->b:Ldg/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
