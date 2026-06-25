.class public interface abstract Ldg/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldg/b$a;
    }
.end annotation


# static fields
.field public static final a:Ldg/b$a;

.field public static final b:Ldg/b;

.field public static final c:Ldg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ldg/b$a;->a:Ldg/b$a;

    .line 2
    .line 3
    sput-object v0, Ldg/b;->a:Ldg/b$a;

    .line 4
    .line 5
    new-instance v0, Ldg/b$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Ldg/b$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ldg/b;->b:Ldg/b;

    .line 11
    .line 12
    new-instance v0, Lgg/a;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lgg/a;-><init>(Ldg/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ldg/b;->c:Ldg/b;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public abstract a(Ldg/G;Ldg/E;)Ldg/C;
.end method
